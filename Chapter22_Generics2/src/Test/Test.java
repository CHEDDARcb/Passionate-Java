class Box7<T>{
     private T ob;
     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

class Plastic {}
interface Lookable{}

class Toy extends Plastic implements Lookable{
     @Override 
     public String toString(){
          return "I am a Toy";
     }
}

class Car extends Toy{}
class Robot extends Toy{}

class BoxHandler{
     public static void outBox(Box7<? extends Toy> box){
          Toy t = box.get();
          System.out.println(t);

          Lookable l = box.get();
          Plastic p = box.get();
     }

     public static void inBox(Box7<? super Toy> box, Toy toy){
          box.set(toy);
          box.set(new Toy());
     }
}

public class Test {
     public static void main(String[] args){
          Box7<Toy> box = new Box7<>();
          BoxHandler.inBox(box, new Toy());
          BoxHandler.outBox(box);
     }
}
