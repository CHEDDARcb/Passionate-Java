public class UsingNestedLoops2 {
     public static void main(String[] args){
          for(int a = 0; a < 10; ++a){
               for(int b = a; b < 10; ++b){
                    int r = (a * 10 + b) + (b * 10 + a);
                    if(r == 99){
                         System.out.println("   " + a + " " + b);
                         System.out.println(" + " + b + " " + a);
                         System.out.println("-------");
                         System.out.println("    " + r);
                         System.out.println();
                    }
               }
          }
     }
}
