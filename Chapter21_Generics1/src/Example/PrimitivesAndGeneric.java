class Box2<T>{
     private T obj;

     public void set(T o){
          obj = o;
     }

     public T get(){
          return obj;
     }
}

public class PrimitivesAndGeneric {
     public static void main(String[] args){
          Box2<Integer> iBox = new Box2<Integer>();
          iBox.set(125);
          int num = iBox.get();
          System.out.println(num);
     }
}
