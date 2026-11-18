import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class Car{
     private String model;
     private String color;

     public Car(String m, String c){
          model = m;
          color = c;
     }

     @Override
     public String toString(){
          return model + " : " + color;
     }

     @Override
     public int hashCode(){
          return (model.hashCode() + color.hashCode()) / 2;
     }

     @Override 
     public boolean equals(Object obj){
          Car co = (Car)obj;
          if(model.equals(co.model) && color.equals(co.color))
               return true;
          else 
               return false;
     }
}

public class HowHashCode {
     public static void main(String[] args){
          HashSet<Car> set = new HashSet<>();
          set.add(new Car("HY_301", "RED"));
          set.add(new Car("HY_301", "Black"));
          set.add(new Car("HY_302", "RED"));
          set.add(new Car("HY_302", "WHITE"));
          set.add(new Car("HY_301", "BLACK"));
          System.out.println("Num of Instances: " + set.size());

          for(Car c : set)
               System.out.println(c);
     }
}
