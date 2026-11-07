import java.util.Arrays;

public class CopyOfArrays {
     public static void main(String[] args){
          double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};

          double[] arcpy1 = Arrays.copyOf(arOrg, arOrg.length);

          double[] arcpy2 = Arrays.copyOf(arOrg, 3);

          for (double d : arcpy1) {
               System.out.println(d);
          }

          System.out.println();
          
          for (double d : arcpy2) {
               System.out.println(d);
          }
     }
}
