# Java Generics: `sort()`와 `binarySearch()`의 타입 제한

이 문서는 `Comparable<T>`, 제네릭 타입 매개변수의 상한, `? extends`, `? super`가 `Collections.sort()`와 `Collections.binarySearch()`에서 어떤 역할을 하는지 정리한다.

---

## 1. 먼저 알아둘 개념

### 1.1 `Comparable<T>`

`Comparable<T>`는 객체가 **T 타입의 객체와 자신을 비교할 수 있음**을 나타내는 인터페이스다.

```java
class Car2 implements Comparable<Car2> {
    protected int disp;

    public Car2(int disp) {
        this.disp = disp;
    }

    @Override
    public int compareTo(Car2 other) {
        return Integer.compare(disp, other.disp);
    }
}

class ECar extends Car2 {
    private int battery;

    public ECar(int disp, int battery) {
        super(disp);
        this.battery = battery;
    }
}
```

`ECar`는 `Comparable`을 직접 구현하지 않았지만, `Car2`를 상속하면서 `Comparable<Car2>`도 물려받는다.

따라서 다음 관계가 성립한다.

```text
Car2 implements Comparable<Car2>
       ▲
       │ 상속
      ECar
```

여기서 중요한 점은 다음과 같다.

- `ECar`가 상속받은 것은 `Comparable<ECar>`가 아니라 `Comparable<Car2>`다.
- `ECar` 객체는 `Car2` 타입의 매개변수를 받는 `compareTo(Car2)`를 사용할 수 있다.
- `ECar`는 `Car2`의 하위 타입이므로 `ECar` 객체를 `Car2` 매개변수에 전달할 수 있다.

### 1.2 `? extends`와 `? super`

| 표현 | 의미 | 핵심 |
|---|---|---|
| `? extends X` | X 또는 X의 하위 타입 중 알 수 없는 타입 | 상한 제한 |
| `? super X` | X 또는 X의 상위 타입 중 알 수 없는 타입 | 하한 제한 |

예를 들어:

```java
List<? extends Number> numbers;
```

리스트 원소 타입은 `Number` 또는 그 하위 타입이다.

```java
Comparable<? super ECar>
```

`Comparable`의 타입 인자로 `ECar` 또는 `ECar`의 상위 타입이 올 수 있다. 예를 들어 `Comparable<ECar>`와 `Comparable<Car2>`가 모두 이 조건에 해당한다.

> **주의:** `? super T`가 있다고 해서 리스트 원소 타입 자체가 T의 상위 타입 또는 하위 타입으로 제한되는 것은 아니다. 와일드카드가 놓인 위치를 확인해야 한다.

---

## 2. `Collections.sort()`

실제 메서드 선언은 다음과 같다.

```java
public static <T extends Comparable<? super T>> void sort(List<T> list);
```

### 2.1 T가 의미하는 것

여기서 `T`는 **리스트 원소의 타입**이다.

```java
List<T> list
```

그리고 T 자체에 다음 상한이 지정되어 있다.

```java
T extends Comparable<? super T>
```

즉, 리스트 원소 타입 T는 T 자신 또는 T의 상위 타입을 비교 대상으로 받는 `Comparable`을 구현하거나 상속받아야 한다.

정렬 과정에서는 리스트의 원소끼리 비교해야 하므로, 원소 T가 다른 T 원소를 `compareTo()`에 전달할 수 있어야 한다.

### 2.2 왜 `Comparable<T>`가 아니라 `Comparable<? super T>`인가?

다음처럼 선언했다고 가정해 보자.

```java
public static <T extends Comparable<T>> void sort(List<T> list);
```

`List<ECar>`를 전달하면 T는 `ECar`로 추론된다. 그러면 `Comparable<ECar>`가 필요하다.

하지만 예제의 `ECar`는 부모 `Car2`로부터 `Comparable<Car2>`를 상속받았다. `Comparable<ECar>`를 구현한 것은 아니다.

따라서 위 선언으로는 `List<ECar>`를 정렬할 수 없다.

반면 실제 선언은 다음을 허용한다.

```java
T extends Comparable<? super T>
```

`T = ECar`를 대입하면:

```java
ECar extends Comparable<? super ECar>
```

`? super ECar`는 `ECar` 자신뿐 아니라 상위 타입인 `Car2`도 허용한다. 따라서 `Comparable<Car2>`를 상속받은 `ECar`도 조건을 만족한다.

```java
List<ECar> cars = new ArrayList<>();
cars.add(new ECar(1200, 99));
cars.add(new ECar(3000, 55));

Collections.sort(cars); // 가능
```

### 2.3 `sort()`의 핵심

- T는 리스트 원소 타입이다.
- 정렬은 리스트 원소끼리 비교해야 한다.
- 따라서 원소 타입 T 자체에 비교 가능 조건을 둔다.
- `? super T`는 T의 부모 타입에서 `Comparable`을 구현한 경우도 허용한다.

---

## 3. `Collections.binarySearch()`

자연 순서(natural ordering)를 사용하는 메서드의 선언은 다음과 같다.

```java
public static <T> int binarySearch(
    List<? extends Comparable<? super T>> list,
    T key
);
```

### 3.1 여기서 T가 의미하는 것

여기서 T는 **리스트 원소 타입이 아니라 검색할 key의 타입**이다.

```java
T key
```

`binarySearch()`는 리스트의 원소와 key를 비교한다. 비교 방향은 개념적으로 다음과 같다.

```java
list.get(mid).compareTo(key);
```

따라서 key가 `Comparable`을 구현할 필요는 없다. 리스트 원소가 key를 비교할 수 있으면 된다.

### 3.2 매개변수에 있는 두 개의 `?`는 서로 다른 와일드카드

```java
List<? extends Comparable<? super T>> list
      └───────────────┬──────────────┘
                      
```

이 타입에는 서로 독립적인 와일드카드가 두 개 있다.

**① 바깥쪽 `? extends`**

```java
List<? extends Comparable<? super T>>
      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
```

리스트 원소 타입에 대한 제한이다. 원소 타입은 `Comparable<? super T>`를 만족하는 어떤 타입이어도 된다.

**② 안쪽 `? super T`**

```java
Comparable<? super T>
           ^^^^^^^^
```

`Comparable`의 타입 인자에 대한 하한 제한이다. `Comparable`이 T 또는 T의 상위 타입을 비교 대상으로 받을 수 있도록 한다.

두 `?`는 같은 타입을 뜻하지 않는다. 각자 다른 위치에서 독립적으로 타입 범위를 지정한다.

### 3.3 왜 T 자체에 상한을 지정하지 않을까?

검색 key는 `Comparable`을 구현할 필요가 없기 때문이다.

예를 들어 리스트의 원소가 `Car2`이고 검색 key가 `ECar`일 수 있다.

```java
List<Car2> cars = new ArrayList<>();
ECar key = new ECar(1800, 99);

Collections.binarySearch(cars, key); // 타입 조건상 가능
```

컴파일러는 key의 타입을 기준으로 T를 `ECar`로 추론한다. 리스트 원소 타입인 `Car2`는 `Comparable<Car2>`를 구현하고 있으며, `Car2`는 `ECar`의 상위 타입이다. 따라서 `Comparable<Car2>`는 `Comparable<? super ECar>` 조건을 만족한다.

실제 비교도 가능하다.

```java
Car2 element = cars.get(0);
ECar key = new ECar(1800, 99);

element.compareTo(key); // 가능: ECar는 Car2이기도 함
```

이번에는 반대 방향도 가능하다.

```java
List<ECar> cars = new ArrayList<>();
Car2 key = new Car2(1800);

Collections.binarySearch(cars, key); // 타입 조건상 가능
```

T는 `Car2`가 된다. `ECar`는 `Comparable<Car2>`를 상속받았으므로 리스트 원소가 `Car2` 타입의 key를 비교할 수 있다.

### 3.4 리스트 원소와 key가 상속 관계가 없어도 가능한 경우

리스트 원소가 key를 받을 수 있는 상위 타입으로 `Comparable`을 구현했다면, 두 클래스가 서로 상속 관계가 없어도 타입 조건을 만족할 수 있다.

```java
class Weird implements Comparable<Number> {
    private final int value;

    Weird(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Number n) {
        return Integer.compare(value, n.intValue());
    }
}

List<Weird> values = new ArrayList<>();
values.add(new Weird(10));
Integer key = 10;

Collections.binarySearch(values, key); // 타입 조건상 가능
```

- key 타입 T는 `Integer`다.
- `Integer`의 상위 타입 중 하나는 `Number`다.
- `Weird`는 `Comparable<Number>`를 구현한다.
- 따라서 `Weird`의 `compareTo(Number)`에 `Integer` key를 전달할 수 있다.

즉, 리스트 원소 타입과 key 타입 사이에 반드시 상속 관계가 있어야 하는 것은 아니다. 핵심은 **리스트 원소의 `compareTo()`가 key를 인자로 받을 수 있는가**이다.

### 3.5 `binarySearch()`의 핵심

- T는 검색 key의 타입이다.
- 리스트 원소 타입은 T와 같을 필요가 없다.
- 리스트 원소가 `Comparable<? super T>` 조건을 만족해야 한다.
- 바깥쪽 `? extends`는 해당 조건을 만족하는 다양한 리스트 원소 타입을 허용한다.
- 안쪽 `? super T`는 T의 상위 타입을 비교 대상으로 받는 `Comparable`도 허용한다.

---

## 4. 왜 다음 선언은 목적에 맞지 않을까?

다음과 같이 선언했다고 가정해 보자.

```java
public static <T extends Comparable<? super T>> int binarySearch(
    List<T> list,
    T key
);
```

이 선언에서는 T가 리스트 원소 타입이면서 key 타입이기도 하다.

따라서 아래 호출은 허용되지 않는다.

```java
List<ECar> cars = new ArrayList<>();
Car2 key = new Car2(1800);

binarySearch(cars, key); // 컴파일 오류
```

첫 번째 인자에서 T는 `ECar`여야 하지만, 두 번째 인자 `key`는 `Car2`다. 메서드의 두 매개변수 모두 같은 T를 요구하므로 타입이 일치하지 않는다.

실제 `binarySearch()`는 T를 key 타입으로 사용하고, 리스트 원소 타입은 별도의 와일드카드로 유연하게 표현한다.

---

## 5. `sort()`와 `binarySearch()` 비교

| 구분 | `sort()` | `binarySearch()` |
|---|---|---|
| 선언 | `<T extends Comparable<? super T>> void sort(List<T> list)` | `<T> int binarySearch(List<? extends Comparable<? super T>> list, T key)` |
| T의 의미 | 리스트 원소 타입 | 검색 key 타입 |
| 비교 대상 | 리스트 원소와 다른 리스트 원소 | 리스트 원소와 key |
| 제한을 두는 위치 | T 자체 | 리스트 원소 타입 |
| `? super T`의 역할 | 원소 T의 부모 타입에서 구현한 Comparable 허용 | key T의 부모 타입을 받는 Comparable 허용 |
| 타입 관계 | 원소 타입이 T로 고정 | 리스트 원소 타입과 key 타입이 달라도 됨 |

### 한 문장으로 기억하기

- **`sort()`**: 리스트 원소끼리 비교해야 하므로 원소 타입 T 자체가 `Comparable<? super T>` 조건을 만족해야 한다.
- **`binarySearch()`**: 리스트 원소가 검색 key를 비교할 수 있으면 되므로, 리스트 원소 타입에 `Comparable<? super T>` 조건을 부여한다. 이때 T는 key의 타입이다.

---

## 6. 컴파일 가능 여부와 실제 검색 결과는 별개

제네릭 선언은 `compareTo(key)`를 호출할 수 있는 타입 관계를 검사한다. 하지만 그것만으로 검색 결과의 정확성까지 보장하지는 않는다.

`binarySearch()`를 올바르게 사용하려면 다음 사항도 필요하다.

1. 리스트가 검색에 사용하는 자연 순서에 따라 미리 정렬되어 있어야 한다.
2. `compareTo()`의 비교 기준이 정렬과 검색에서 일관되어야 한다.
3. `compareTo()`가 `0`을 반환하는 것은 비교 순서상 동등하다는 뜻이다. 반드시 같은 객체이거나 런타임 클래스가 같다는 뜻은 아니다.

예를 들어 `Car2.compareTo()`가 배기량만 비교한다면, 검색 key가 `ECar`여도 같은 배기량을 가진 일반 `Car2` 객체의 위치가 반환될 수 있다. `binarySearch()`는 객체의 실제 클래스나 참조 동일성이 아니라 `compareTo()`의 결과를 기준으로 검색한다.

---

## 7. 최종 요약

```text
sort(List<T> list)
  T = 리스트 원소 타입
  └─ T가 T 자신 또는 T의 상위 타입과 비교 가능해야 함

binarySearch(List<? extends Comparable<? super T>> list, T key)
  T = 검색 key 타입
  └─ 리스트 원소가 T 또는 T의 상위 타입을 비교 대상으로 받을 수 있어야 함
```

제네릭 와일드카드를 해석할 때는 `?`가 무엇을 제한하는지 위치를 먼저 확인한다.

- `List<? extends ...>`: 리스트 원소 타입의 범위를 제한한다.
- `Comparable<? super T>`: Comparable의 타입 인자, 즉 비교 대상으로 받을 수 있는 타입의 범위를 제한한다.

이 둘을 구분하면 `sort()`와 `binarySearch()`의 제네릭 선언이 서로 다른 이유를 이해할 수 있다.
