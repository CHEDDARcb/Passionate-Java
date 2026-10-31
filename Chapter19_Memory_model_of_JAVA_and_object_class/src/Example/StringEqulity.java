public class StringEqulity {
     public static void main(String[] args){
          String str1 = new String("Simple");
          String str2 = new String("Simple");

          if(str1 == str2)
               System.out.println("same");
          else
               System.out.println("different");

          if(str1.equals(str2))
               System.out.println("same");
          else
               System.out.println("different");
     }     
}
