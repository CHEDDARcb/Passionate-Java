class SuperCLS2{
     protected static int count = 0;

     public SuperCLS2(){
          count++;
     }
}

class SubCLS2 extends  SuperCLS2{
     public void showCount(){
          System.out.println(count);
     }
}

public class SuperSubStatic {
     public static void main(String[] args){
          SuperCLS2 obj1 = new SuperCLS2();
          SuperCLS2 obj2 = new SuperCLS2();

          SubCLS2 obj3 = new SubCLS2();
          obj3.showCount();
     }
}
