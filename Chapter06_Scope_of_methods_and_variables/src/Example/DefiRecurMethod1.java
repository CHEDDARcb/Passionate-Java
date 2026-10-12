public class DefiRecurMethod1{
     public static void main(String[] args){
          System.out.println("2 to Power of 3: " + TwoToPowerOfN(3));
     }

     public static int TwoToPowerOfN(int n){
          if(n == 0) return 1;
          if(n == 1) return 2;

          return 2 * TwoToPowerOfN(n - 1);
     }
}