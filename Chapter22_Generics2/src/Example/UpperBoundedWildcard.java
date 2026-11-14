class Box5<T>{
     private T ob;
     public Box5() { }
     public Box5(T o) { ob = o; }
     public void set(T o) { ob = o; }
     public T get() { return ob; }

     @Override 
     public String toString() { return ob.toString(); }
}

class UnBoxer3{
     public static void peekBox(Box5<? extends Number> box){
          System.out.println(box);
     }
}

public class UpperBoundedWildcard {
     public static void main(String[] args){
          Box5<Integer> iBox = new Box5<>(1234);
          Box5<Double> dBox = new Box5<>();
          dBox.set(3.154);

          UnBoxer3.peekBox(iBox);
          UnBoxer3.peekBox(dBox);
     }
}
