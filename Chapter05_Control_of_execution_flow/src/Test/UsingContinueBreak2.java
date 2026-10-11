public class UsingContinueBreak2 {
     public static void main(String[] args){
          int n = 1;
          int r = 0;

          while(true){
               if((n % 2) == 1){
                    r += n;
               }

               if(r > 1000)
                    break;
               ++n;
          }

          System.out.println("r: " + r);
          System.out.println("n: " + n);
     }
}
