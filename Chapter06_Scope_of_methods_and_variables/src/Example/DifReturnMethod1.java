public class DifReturnMethod1 {
     public static void main(String[] args){
          float area = CalArea(3);
          float circum = CalCircum(3);

          System.out.println("Area: " + area);
          System.out.println("Circum: " + circum);
     }

     public static float CalArea(int r){
          return 3.141562f * r * r;
     }

     public static float CalCircum(int r){
          return 3.14f * r * 2;
     }

     
}
