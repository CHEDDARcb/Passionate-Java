public class DefinitionOfAMethod2 {
     public static void main(String[] args){
          AbsoluteCal(123, 15);
     }

     public static void AbsoluteCal(int n1, int n2){
          int r = n1 > n2 ? n1 - n2 : n2 - n1;
          System.out.println(r);
     }
}
