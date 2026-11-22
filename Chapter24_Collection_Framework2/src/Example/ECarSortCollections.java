import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Car2 implements Comparable<Car2>{
     protected  int disp;

     public Car2(int d) { disp = d; }

     @Override
     public String toString() { return "cc: " + disp; }

     @Override 
     public int compareTo(Car2 c){
          return disp - c.disp;
     }
}

class ECar extends Car2{
     private int battery;

     public ECar(int d, int b){
          super(d);
          battery = b;
     }

     @Override 
     public String toString() {
          return "cc: " + disp + ", ba: " + battery;
     }
}

public class ECarSortCollections {
     public static void main(String[] args){
          List<ECar> list = new ArrayList<>();
          list.add(new ECar(1200, 99));
          list.add(new ECar(3000, 55));
          list.add(new ECar(1800, 87));
          Collections.sort(list);

          for(Iterator<ECar> iter = list.iterator(); iter.hasNext(); ){
               System.out.println(iter.next());
          }
          System.out.println();
     }
}
