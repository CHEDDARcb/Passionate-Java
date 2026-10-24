class CheeseCake extends Cake{
     protected int size;

     public CheeseCake(int sz1, int sz2){
          super(sz1);
          size = sz2;
     }

     public void ShowCakeSize(){
          System.out.println("Bread Ounces: " + super.size);
          System.out.println("Cheese Ounces: " + size);
     }

     public void yummy(){
          super.yummy();
          System.out.println("Yummy Cheese Cake");
     }

     public void tasty(){
          super.yummy();
          System.out.println("Yummy Tasty Cake");
     }
}