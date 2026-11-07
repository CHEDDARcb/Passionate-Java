class Box9<T extends Number>{
     private T obj;

     public void set(T o){
          obj = o;
     }

     public T get(){
          return obj;
     }
}

public class DefGenericMethodAndLimitParam {

      public static <T extends Number> void swapBox(Box9<T> b1, Box9<T> b2){
          T tmp = b1.get();
          b1.set(b2.get());
          b2.set(tmp);
     }

     public static void main(String[] args){
          Box9<Integer> b1 = new Box9<>();
          Box9<Integer> b2 = new Box9<>();

          b1.set(99);
          b2.set(55);

          System.out.println(b1.get() + "&" + b2.get());
          swapBox(b1, b2);
          System.out.println(b1.get() + "&" + b2.get());
     }
}
