class Triangle{
     int base;
     int height;
     public Triangle(int b, int h){
          base = b;
          height = h;
     }

     public float Area(){
          return base * height * 0.5f;
     }
}

public class DifClaaIncludeConst {
     public static void main(String[] args){
          Triangle t1 = new Triangle(4, 3);

          System.out.println("Area: " + t1.Area());
     }
}
