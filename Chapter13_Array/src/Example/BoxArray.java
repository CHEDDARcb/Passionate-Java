class Box{
     private String str;

     public Box(String str){
          this.str = str;
     }

     public String toString(){
          return str;
     }
}

public class BoxArray {
     public static void main(String[] args){
          Box[] ar = new Box[3];

          ar[0] = new Box("First");
          ar[1] = new Box("Second");
          ar[2] = new Box("Third");
          
          System.out.println(ar[0].toString());
          System.out.println(ar[1]);
          System.out.println(ar[2]);
     }
}
