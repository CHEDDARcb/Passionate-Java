import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

class TreeMapComparator implements Comparator<Integer>{
     public int compare(Integer n1, Integer n2){
          return n2 - n1;
     }
}

public class TreeMapIteration {
     public static void main(String[] args){
          TreeMap<Integer, String> map = new TreeMap<>(new TreeMapComparator());
          map.put(45, "Brown");
          map.put(37, "James");    
          map.put(23, "Martin");

          Set<Integer> ks = map.keySet();

          for(Integer n : ks)
               System.out.println(n.toString() + ": " + map.get(n));
          System.out.println();

          for(Iterator<Integer> iter = ks.iterator(); iter.hasNext();){
               Integer n = iter.next();
               System.out.println(n.toString() + " : " + map.get(n));
          }
     }
}

