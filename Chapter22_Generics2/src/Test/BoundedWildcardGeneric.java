class Box10<T>{
     private T ob;

     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

public class BoundedWildcardGeneric {
     public static <T> boolean compBox(Box9<? extends T> box, T con){
          T bc = box.get();
          //box.set(con);
          return bc.equals(con);
     }
     public static void main(String[] args){
          Box9<Integer> box1 = new Box9<>();
          box1.set(24);
          Box9<String> box2 = new Box9<>();
          box2.set("Moly");

          if(compBox(box1, 25))
               System.out.println("상자 안에 25저장");
          if(compBox(box2, "Moly"))
               System.out.println("상자 안에 Moly저장");

          System.out.println(box1.get());
          System.out.println(box2.get());
     }
}
