public class DefinitionOfAMethod1{
     public static void main(String[] args){
          Operations(1, 2);
     }

     public static void Operations(int n1, int n2){
          System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
          System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
          System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
          System.out.println(n1 + " / " + n2 + " = " + n1 / n2 + "..." + n1 % n2);
     }
}