class Box3<T>{
     private T ob;
     public void set(T o) { ob = o; }
     public T get() { return ob; }

     @Override 
     public String toString(){
          return ob.toString();
     }
}

class UnBoxer1{
     public static <T> T openBox(Box3<T> box){
          return box.get();
     }

     public static <T> void peekBox(Box3<T> box){
          System.out.println(box);
     }
}

public class WildcardUnboxer {
     public static void main(String[] args){
          Box3<String> box = new Box3<>();
          box.set("So Simple String");
          UnBoxer1.peekBox(box);
     }
     
}
