public class ImmutableString {
     public static void main(String[] args){
          String str1 = "Simple String";
          String str2 = "Simple String";

          String str3 = new String("Simple String");
          String str4 = new String("Simple String");

          if(str1 == str2)
               System.out.println("str1 and str2 are same instance.");
          else
               System.out.println("str1 and str2 are different instance");

          if(str3 == str4)
               System.out.println("str3 and str4 are same instance.");
          else
               System.out.println("str3 and str4 are different instance");
     }
}
