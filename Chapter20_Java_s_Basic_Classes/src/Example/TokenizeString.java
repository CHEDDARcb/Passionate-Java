import java.util.StringTokenizer;

public class TokenizeString {
     public static void main(String[] args){
          StringTokenizer stn = new StringTokenizer("PM:08:45", ":");

          while(stn.hasMoreElements()){
               System.out.print(stn.nextToken() + ", ");
          }
          System.out.println();

          StringTokenizer stn2 = new StringTokenizer("12 + 36 - 8 / 2 = 44", "+-/= ");

          while(stn2.hasMoreElements())
               System.out.print(stn2.nextToken() + ", ");
     }
}
