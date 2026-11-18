import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class StringComparator implements Comparator<String>{
     public int compare(String s1, String s2){
          return s1.length() - s2.length();
     }
}

public class ComparatorString {
     public static void main(String[] args){
          Set<String> tree = new TreeSet<>(new StringComparator());
          tree.add("Box");
          tree.add("Rabbit");
          tree.add("Robot");

          for(String p : tree)
               System.out.println(p);
          System.out.println();

     }
}
