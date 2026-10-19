public class UsingAStringClass {
     public static void main(String[] args){
          String orig = "990925-1012999";

          // subString만 사용
          /* System.out.println(
               orig.substring(0, 6) +
               " " +
               orig.substring(9)); */

          // replace사용
          String r = orig.replace('-', ' ');
          System.out.println(r);

          StringBuilder st = new StringBuilder("df");
          st.append(3);
          System.out.println(st);

     }
     
}
