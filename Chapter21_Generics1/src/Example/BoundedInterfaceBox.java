interface Eatable{
     public String eat();
}

class Apple2 implements Eatable{
     @Override 
     public String toString(){
          return "I am an Apple";
     }

     @Override 
     public String eat(){
          return "It tastes so good!";
     }
}

class Box5<T extends Eatable>{
     private T ob;

     public void set(T o){
          ob = o;
     }

     public T get(){
          System.out.println(ob.eat());
          return ob;
     }
}

public class BoundedInterfaceBox {
     public static void main(String[] args){
          Box5<Apple2> aBox = new Box5<>();
          aBox.set(new Apple2());

          Apple2 ap = aBox.get();
          System.out.println(ap);
     }
}
