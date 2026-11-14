interface Getable<T> {
     public T get();
}

class Box11<T> implements Getable<T>{
     private T ob;

     public void set(T o) { ob = o; }

     @Override
     public T get() { return ob; }
}

class Toy4{
     @Override 
     public String toString() { return "I am a Toy"; }
}

public class GetableGenericInterface {
     public static void main(String[] args){
          Box11<Toy4> tBox = new Box11<>();
          tBox.set(new Toy4());

          Getable<Toy4> gt = tBox;
          System.out.println(gt.get());
     }
}
