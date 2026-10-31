public class Point {
     private int xPos;
     private int yPos;

     public Point(int x, int y){
          xPos = x;
          yPos = y;
     }

     @Override 
     public  boolean equals(Object o){
          Point p = (Point) o;

          if(!(p instanceof Point))
               return false;

          if(xPos == p.xPos && yPos == p.yPos)
               return true;
          else
               return false;
     }
}
