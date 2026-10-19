import java.util.Scanner;

public class ScanningString {
     public static void main(String[] args){
          String source = "1 3 5";
          Scanner scn = new Scanner(source);
          int num1 = scn.nextInt();
          int num2 = scn.nextInt();
          int num3 = scn.nextInt();

          int r = num1 + num2 + num3;
          System.out.printf("%d", r);
     }
}
