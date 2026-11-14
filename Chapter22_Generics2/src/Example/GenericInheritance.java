class Box1<T>{
     protected T ob;

     public void set(T o) { ob = o; }
     public T get() { return ob; }
}

class SteelBox<T> extends Box1<T>{
     public SteelBox(T o){
          ob = o;
     }
}

public class GenericInheritance{
     public static void main(String[] args){
          Box1<Integer> iBox = new SteelBox<>(7959);
          Box1<String> sBox = new SteelBox<>("Simple");
          System.out.println(iBox.get());
          System.out.println(sBox.get());
     }
}