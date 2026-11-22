import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Car implements Comparable<Car3>{
     private int disp;

     public Car(int d) { disp = d; }

     @Override
     public String toString() { return "cc: " + disp; }

     @Override 
     public int compareTo(Car3 c){
          return disp - c.disp;
     }
}

public class CarSortCollections {
     public static void main(String[] args){
          List<Car3> list = new ArrayList<>();
          list.add(new Car3(1200));
          list.add(new Car3(3000));
          list.add(new Car3(1800));
          Collections.sort(list);

          for(Iterator<Car3> iter = list.iterator(); iter.hasNext(); ){
               System.out.println(iter.next());
          }
          System.out.println();
     }
}
