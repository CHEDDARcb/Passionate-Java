public class DefineEqualsMethod {
     public static void main(String[] args){
          Point p1 = new Point(1, 2);
          Point p2 = new Point(1, 2);
          Point p3 = new Point(2, 3);

          if(p1.equals(p2))
               System.out.println("p1, p2 is same");
          else
               System.out.println("p1, p2 is different");

           if(p1.equals(p3))
               System.out.println("p1, p3 is same");
          else
               System.out.println("p1, p3 is different");

          Rectangle r1 = new Rectangle(1, 2, 3, 4);
          Rectangle r2 = new Rectangle(1, 2, 3, 4);
          Rectangle r3 = new Rectangle(2, 3, 4, 4);

          if(r1.equals(r2))
               System.out.println("r1, r2 is same");
          else
               System.out.println("r1, r2 is different");

           if(r1.equals(r3))
               System.out.println("r1, r3 is same");
          else
               System.out.println("r1, r3 is different");
     }
}
