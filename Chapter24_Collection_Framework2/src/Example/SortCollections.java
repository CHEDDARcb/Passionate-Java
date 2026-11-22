import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class SortCollections {
     public static void main(String[] args){
          List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
          list = new ArrayList<>(list);

          for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
               System.out.print(iter.next() + "\t");
          }
          System.out.println();

          Collections.sort(list);

          for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
               System.out.print(iter.next() + "\t");
          }
     }
}
