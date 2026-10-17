import static java.lang.Math.*;

public class StaticImport {
     public static void main(String[] args){
          System.out.println(Math.E);
          System.out.println(PI);

          System.out.println(java.lang.Math.abs(-55));
          System.out.println(Math.max(77, 88));
          System.out.println(min(33,55));
     }
}
