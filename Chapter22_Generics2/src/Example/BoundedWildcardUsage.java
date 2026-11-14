class Box8<T>{
     private T ob;
     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

class Plastic{

}

class Toy2 extends Plastic{
     @Override
     public String toString(){
          return "I am a Toy";
     }
}

class Car extends Toy2{

}

class BoxHandler2{
     public static void outBox(Box8<? extends Toy2> box){
          Toy2 t = box.get();
          System.out.println(t);

          // box.set(new Toy());
     }

     public static void inBox(Box8<? super Toy2> box, Toy2 t){
          box.set(t);
          //Plastic t1 = box.get();
     }
}

public class BoundedWildcardUsage {
     public static void main(String[] args){
          Box8<Toy2> box = new Box8<>();
          BoxHandler2.inBox(box, new Car());
          BoxHandler2.inBox(box, new Toy2());
          BoxHandler2.outBox(box);

          Box8<Plastic> pBox = new Box8<>();
          BoxHandler2.inBox(pBox, new Toy2());
     }
}
