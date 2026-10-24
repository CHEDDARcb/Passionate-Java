public class YummyCakeSize {
     public static void main(String[] args){
          CheeseCake ca1 = new CheeseCake(5,7);
          Cake ca2 = ca1;

          System.out.println("Braead OUnces: " + ca2.size);

          System.out.println("Cheese Ounces: " + ca1.size);
          System.out.println();

          ca1.ShowCakeSize();
          System.out.println();
          ca2.ShowCakeSize();
     }
}
