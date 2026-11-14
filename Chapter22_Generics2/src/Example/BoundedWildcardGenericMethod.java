class Box9<T>{
     private T ob;

     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

class Toy3{
     @Override 
     public String toString() { return "I am a Toy"; }
}

class Robot2{
     @Override 
     public String toString() { return "I am a Robot"; }
}

class BoxHandler3{
     public static <T> void outBox(Box9<? extends T> box){
          T t = box.get();
          System.out.println(t);
     }

     public static <T> void inBox(Box9<? super T> box, T n){
          box.set(n);
     }
}

public class BoundedWildcardGenericMethod {
     public static void main(String[] args){
          Box9<Toy3> tBox = new Box9<>();
          BoxHandler3.inBox(tBox, new Toy3());
          BoxHandler3.outBox(tBox);

          Box9<Robot2> rBox = new Box9<>();
          BoxHandler3.inBox(rBox, new Robot2());
          BoxHandler3.outBox(rBox);
     }
}
