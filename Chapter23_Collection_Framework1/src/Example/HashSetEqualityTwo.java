import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class Num2{
     private int num;

     public Num2(int n) { num = n; }
     
     @Override
     public String toString(){
          return String.valueOf(num);
     }

     @Override
     public int hashCode(){
         return num % 3;
     }

     @Override
     public boolean equals(Object obj){
          if(this == obj) return true;
          if(!(obj instanceof Num2)) return false;
     
         Num2 o = (Num2)obj;
         return this.num == o.num;
     }
}

public class HashSetEqualityTwo {
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