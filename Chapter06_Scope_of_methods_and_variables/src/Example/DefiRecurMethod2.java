public class DefiRecurMethod2 {
     public static void main(String[] args){
          DecimalToBinary(16);
     }

     public static void DecimalToBinary(int dec){
          int q = dec / 2;
          int rm = dec % 2;

          if(q > 0){
               DecimalToBinary(q);
               System.out.print(rm);
          }
          else
               System.out.print(rm);


     }
}