class Point3 implements Cloneable{
     private int xPos;
     private int yPos;

     public Point3(int x, int y){
          xPos = x;
          yPos = y;
     }

     public void changePos(int x, int y){
          xPos = x;
          yPos = y;
     }

     public void showPosition(){
          System.out.printf("[%d, %d]", xPos, yPos);
          System.out.println();
     }

     @Override 
     public Object clone() throws CloneNotSupportedException{
          return super.clone();
     }
}

class Rectangle2 implements Cloneable{
     private Point3 ul;
     private Point3 dr;

     public Rectangle2(int x1, int y1, int x2, int y2){
          ul = new Point3(x1, y1);
          dr = new Point3(x2, y2);
     }

     public void changePos(int x1, int y1, int x2, int y2){
          ul.changePos(x1, y1);
          dr.changePos(x2, y2);
     }

     public void showPosition(){
          System.out.print("Up Left: ");
          ul.showPosition();
          System.out.print("Down Right: ");
          dr.showPosition();
     }

     @Override 
     public Object clone() throws CloneNotSupportedException{
          Rectangle2 cp = (Rectangle2)super.clone();

          cp.ul = (Point3)ul.clone();
          cp.dr = (Point3)dr.clone();

          return cp;
     }
}

public class shallowCopy {
     public static void main(String[] args){
          Rectangle2 org = new Rectangle2(1, 1, 2, 2);
          Rectangle2 cpy;

          try{
               cpy = (Rectangle2)org.clone();

               org.changePos(2, 2, 3, 3);

               org.showPosition();
               cpy.showPosition();
          }
          catch(CloneNotSupportedException e){
               e.printStackTrace();
          }
     }
}
