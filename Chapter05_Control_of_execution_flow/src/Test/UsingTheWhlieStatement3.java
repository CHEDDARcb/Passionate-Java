public class UsingTheWhlieStatement3 {
     public static void main(String[] args){
          int n = 2 * 7;
          int r = 0;

          while(n <= 1000){
               r += n;
               n += 2 * 7;
          }

          System.out.println(r);
     }     
}
