import java.util.TreeSet;
import java.util.Iterator;


public class SortedTreeSet {
     public static void main(String[] args){
          TreeSet<Integer> tree = new TreeSet<Integer>();
          tree.add(3);   tree.add(1);
          tree.add(2);   tree.add(4);
          System.out.println("Instance num: " + tree.size());

          for(Integer i : tree)
               System.out.print(i + "\t");
          System.out.println();

          for(Iterator<Integer> iter = tree.iterator(); iter.hasNext(); )
               System.out.print(iter.next() + "\t");
          System.out.println();

     }
}
