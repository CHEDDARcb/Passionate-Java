import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
     public static void main(String[] args){
          int a, z;
          Scanner sc = new Scanner(System.in);
          System.out.print("Input a: ");
          a = sc.nextInt();
          System.out.print("Input z: ");
          z = sc.nextInt();

          int n = 10;
          Random rd = new Random();
          while(n-- > 0) 
               System.out.println(rd.nextInt(a, z + 1));
          
          sc.close();

     }
}
