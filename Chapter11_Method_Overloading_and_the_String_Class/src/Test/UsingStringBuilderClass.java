public class UsingStringBuilderClass {
     final static int ssend = 5;
     final static int ssstart = 7;
     public static void main(String[] args){
          StringBuilder stbl = new StringBuilder("990925-1012999");

          /* for(int i = 0; i < stbl.length(); ++i){
               if(stbl.charAt(i) == '-')
                    System.out.print(' ');
               else
                    System.out.print(stbl.charAt(i));
          } */

          stbl.replace(ssend + 1, ssstart, " ");
          System.out.println(stbl);
     }
}