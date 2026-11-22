import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

class Car4 implements Comparable<Car4>{
     protected int disp;

     public Car4(int d) { disp = d; }

     @Override
     public String toString() { return "cc: " + disp; }

     @Override 
     public int compareTo(Car4 c){
          return disp - c.disp;
     }
}

class ECar3 extends Car4{
     private int battery;

     public ECar3(int d, int b){
          super(d);
          battery = b;
     }

     @Override 
     public String toString() {
          return "cc: " + disp + ", ba: " + battery;
     }
}

class CarComp2 implements Comparator<Car4>{
     @Override 
     public int compare(Car4 c1, Car4 c2){
          return c1.disp - c2.disp;
     }
}

public class BinaryComparatorTest {
     public static void main(String[] args){
          CarComp2 comp = new CarComp2();


          List<Car4> list = new ArrayList<>();
          list.add(new Car4(1200));
          list.add(new Car4(3000));
          list.add(new Car4(1800));
          Collections.sort(list);

          ECar3 key = new ECar3(1200, 3000);
          int idx = Collections.binarySearch(list, key, comp);
          System.out.println(list.get(idx));


          /* 
          List<ECar3> list = new ArrayList<>();
          list.add(new ECar3(1200, 300));
          list.add(new ECar3(3000, 300));
          list.add(new ECar3(1800, 300));
          Collections.sort(list);

          Car4 key = new Car4(1200);
          int idx = Collections.binarySearch(list, key);
          System.out.println(list.get(idx));*/
     }
}
