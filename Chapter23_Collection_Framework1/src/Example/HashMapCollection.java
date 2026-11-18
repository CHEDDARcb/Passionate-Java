import java.util.HashMap;

public class HashMapCollection {
     public static void main(String[] args){
          HashMap<Integer, String> map = new HashMap<>();
          map.put(45, "Brown");
          map.put(37, "James");
          map.put(23, "Martin");

          System.out.println("23: " + map.get(23));
          System.out.println("37: " + map.get(37));
          System.out.println("45: " + map.get(45));

          map.remove(37);

          System.out.println("37: " + map.get(37));
     }
}
