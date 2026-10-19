class Box2{
     private String contents;
     private int boxNum;

     public Box2(int num, String conts){
          boxNum = num;
          contents = conts;
     }

     public int getBoxNum(){
          return boxNum;
     }

     public String toString(){
          return contents;
     }
}

public class EnhancedForInst {
     public static void main(String[] args){
          Box2[] ar = new Box2[5];
          ar[0] = new Box2(101, "Coffee");
          ar[1] = new Box2(202, "Computer");
          ar[2] = new Box2(303, "Apple");
          ar[3] = new Box2(404, "Dress");
          ar[4] = new Box2(505, "Fairy-tale book");

          for(Box2 e : ar){
               if(e.getBoxNum() == 505)
                    System.out.println(e);
          }
     }
}
