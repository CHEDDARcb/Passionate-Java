 import java.util.Comparator;
import java.util.TreeSet;

class IntegerComparator implements Comparator<Integer>{
     public int compare(Integer n1, Integer n2){
          return n2 - n1;
     }
}

public class SpecifyingSortingCriteria {
     public static void main(String[] args){
          TreeSet<Integer> tree = new TreeSet<>(new IntegerComparator());
          tree.add(30);
          tree.add(10);
          tree.add(20);

          System.out.println(tree);
     }
}
