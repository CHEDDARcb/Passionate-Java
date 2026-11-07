class Box7<T>{
     private T ob;

     public void set(T o){
          ob = o;
     }

     public T get(){
          return ob;
     }
}

class UnBoxer{
     public static <T> T openBox(Box7<T> box){
          return box.get();
     }
}

public class GenericMethodBoxMaker2 {
     public static void main(String[] args){
          Box7<String> box = new Box7<>();
          box.set("My Generic Methods");

          String str = UnBoxer.openBox(box);
          System.out.println(str);
     }
}
