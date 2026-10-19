import java.util.Scanner;

public class ScanningKeyboard {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);

          int n1 = sc.nextInt();
          int n2 = sc.nextInt();
          int n3 = sc.nextInt();

          System.out.printf("%d + %d + %d = %d", n1, n2, n3, n1 + n2 + n3);
     }
}
