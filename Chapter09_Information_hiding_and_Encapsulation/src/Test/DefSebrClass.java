class Point{
     private double xPos, yPos;
     public Point(double x, double y){
          xPos = x;
          yPos = y;
     }

     public void ShowPointInfo(){
          System.out.println("[" + xPos + ", " + yPos + "]");
     }
}

class Circle{
     private Point center;
     private double rad;

     public Circle(double cx, double cy, double r){
          center = new Point(cx, cy);
          rad = r;
     }

     public void showCircleInfo(){
          System.out.print("center: "); 
          center.ShowPointInfo();
          System.out.println("radius: " + rad);
     }
}

public class DefSebrClass {
     public static void main(String[] args){
          Circle c1 = new Circle(2.d, 2.d, 4.d);
          c1.showCircleInfo();
     }
}