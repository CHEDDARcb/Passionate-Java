class Box{
     private String str;

     public Box(String str){
          this.str = str;
     }

     public String toString(){
          return str;
     }
}

public class ArrayIsInstance2 {
     public static void main(String[] args){
          Box2[] boxes = new Box2[5];
          System.out.println(boxes.length);
     }
}
