class ParentAdder{
     public int add(int a, int b){
          return a + b;
     }
}

class ChildAdder extends ParentAdder{ 
     public double add(double a, double b){
          System.out.println("Adding");
          return a + b;
     }
}

public class OverrideMistake {
     public static void main(String[] args){
          ChildAdder adder = new ChildAdder();
          System.out.println(adder.add(3.3, 4.6));
     }
}
