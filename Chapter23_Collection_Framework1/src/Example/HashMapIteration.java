import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {
     public static void main(String[] args){
          HashMap<Integer, String> map = new HashMap<>();
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
