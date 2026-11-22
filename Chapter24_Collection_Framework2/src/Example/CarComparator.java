import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

class Car3 implements Comparable<Car3>{
     protected  int disp;

     public Car3(int d) { disp = d; }

     @Override
     public String toString() { return "cc: " + disp; }

     @Override 
     public int compareTo(Car3 c){
          return disp - c.disp;
     }
}

class CarComp implements Comparator<Car3>{
     @Override 
     public int compare(Car3 o1, Car3 o2) { return o1.disp - o2.disp; }
}

class ECar2 extends Car3{
     private int battery;

     public ECar2(int d, int b){
          super(d);
          battery = b;
     }

     @Override 
     public String toString() {
          return "cc: " + disp + ", ba: " + battery;
     }
}

public class CarComparator {
     public static void main(String[] args){
          List<Car3> clist = new ArrayList<>();
          clist.add(new Car3(1200));
          clist.add(new Car3(3000));    
          clist.add(new Car3(1800));
          //Collections.sort(clist);

          List<ECar2> elist = new ArrayList<>();
          elist.add(new ECar2(1200, 99));
          elist.add(new ECar2(3000, 55));
          elist.add(new ECar2(1800, 87));
          //Collections.sort(elist);

          CarComp comp = new CarComp();
          Collections.sort(clist, comp);
          Collections.sort(elist, comp);

          System.out.println("Classic Car");
          for(Iterator<Car3> iter = clist.iterator(); iter.hasNext(); ){
               System.out.println(iter.next());
          }
          System.out.println();
          
          System.out.println("Electronic Car");
          for(Iterator<ECar2> iter = elist.iterator(); iter.hasNext(); ){
               System.out.println(iter.next());
          }
          System.out.println();
     }
}
