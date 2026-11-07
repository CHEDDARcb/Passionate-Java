class Apple{
     @Override
     public String toString(){
          return "I am an apple";
     }
}

class Orange{
     @Override
     public String toString(){
          return "I am an Orange";
     }
}

class Box<T>{
     private T ob;

     public void set(T o){
          ob = o;
     }

     public T get(){
          return ob;
     }
}

public class FruitAndBox2_Generic{
     public static void main(String[] args){
          Box<Apple> aBox = new Box<Apple>();
          Box<Orange> oBox = new Box<Orange>();

          aBox.set(new Apple());
          oBox.set(new Orange());

          //aBox.set("Apple");
          //oBox.set("Orange");

          Apple ap = aBox.get();
          Orange or = oBox.get();

          System.out.println(ap);
          System.out.println(or);
     }
}