public class StringArray {
     public static void main(String[] args){
          String[] st = new String[7];
          st[0] = "Java";
          st[1] = "System";
          st[2] = "Compiler";
          st[3] = "Park";
          st[4] = "Tree";
          st[5] = "Dinner";
          st[6] = "Brunch Cafe";

          int cnt = 0;
          for(int i = 0; i < st.length; ++i)
               cnt += st[i].length();
          
          System.out.println("Total char Count : " + cnt);
     }
}
