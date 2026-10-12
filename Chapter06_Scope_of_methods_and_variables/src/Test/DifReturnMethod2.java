public class DifReturnMethod2 {
     static boolean[] aris = new boolean[101];
     public static boolean Aristo(int n)
     {
          if(n < 2) return false;

          if(!aris[n]) return false;

          for(int i = n + n; i < 101; i += n){
               aris[i] = false;
          }

          return true;
     }

     public static void main(String[] args){
          for(int i = 1; i < 101; ++i){
               aris[i] = true;
          }

          for(int i = 1; i <= 100; ++i){
               if(Aristo(i))
                    System.out.print(i + " ");
          }
     }
}
