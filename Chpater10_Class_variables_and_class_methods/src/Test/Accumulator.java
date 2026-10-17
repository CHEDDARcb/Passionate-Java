public class Accumulator {
     static int num = 0;


     static void add(int n){
          num += n;
     }

     static void showResult(){
          System.out.println(num);
     }

     public static void main(String[] args){
          for(int i = 0; i < 10; ++i){
               Accumulator.add(i);
          }

          Accumulator.showResult();
     }
}
