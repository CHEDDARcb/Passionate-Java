class BoxT<T>{
     private T ob;
     public void set(T o) { ob = o; }
     public T get() { return ob; }
}


public class UpperAndLowerLimitsForWildcard {
     public static void addBox(BoxT<? extends Integer> b1, BoxT<? extends Integer> b2, BoxT<? super Integer> b3){
          b3.set(b1.get() + b2.get()); // 프로그래머의 실수가 있는 부분.
     }
     public static void main(String[] args){
          BoxT<Integer> box1 = new BoxT<>();
          box1.set(24);
          BoxT<Integer> box2 = new BoxT<>();
          box2.set(37);
          BoxT<Integer> result = new BoxT<>();
          result.set(0);

          addBox(box1, box2, result);
          System.out.println(result.get());
     }
}
