class Box7<T>{
     private T ob;
     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

class Toy{
     @Override 
     public String toString(){
          return "I am a Toy";
     }
}

class BoxHandler{
     public static void outBox(Box7<Toy> box){
          Toy t = box.get();
          System.out.println(t);
     }

     public static void inBox(Box7<Toy> box, Toy toy){
          box.set(toy);
     }
}

public class BoundedWildcardBase {
     public static void main(String[] args){
          Box7<Toy> box = new Box7<>();
          BoxHandler.inBox(box, new Toy());
          BoxHandler.outBox(box);
     }
}
