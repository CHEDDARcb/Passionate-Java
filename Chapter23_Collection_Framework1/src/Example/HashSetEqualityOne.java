import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class Num{
     private int num;

     public Num(int n) { num = n; }
     
     @Override
     public String toString(){
          return String.valueOf(num);
     }
}

public class HashSetEqualityOne {
     public static void main(String[] args){
          HashSet<Num2> set = new HashSet<>();
          set.add(new Num2(7799));
          set.add(new Num2(9955));
          set.add(new Num2(7799));
          System.out.println("Num of instance: " + set.size());

          for(Num2 n : set)
               System.out.print(n + "\t");
          System.out.println();
     }
}
