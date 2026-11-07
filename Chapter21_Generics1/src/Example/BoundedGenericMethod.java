class Box8<T>{
     private T ob;

     public void set(T o){
          ob = o;
     }

     public T get(){
          return ob;
     }
}

class BoxFactory2{
     public static <T extends Number> Box8<T> makeBox(T o){
          Box8<T> box = new Box8<>();
          box.set(o);

          System.out.println("Boxed data: " + o.intValue());
          return box;
     }
}

class UnBoxer2{
     public static <T extends Number> T openBox(Box8<T> box){
          System.out.println("UnBox data: " + box.get().intValue());
          return box.get();
     }
}

public class BoundedGenericMethod {
     public static void main(String[] args){
          Box8<Integer> iBox = BoxFactory2.<Integer>makeBox(5959);
          int n = UnBoxer2.openBox(iBox);
          System.out.println("Returned data: " + n);
     }
}
