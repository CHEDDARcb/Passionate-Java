import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;


public class AsListCollection {
     public static void main(String[] args){
          List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
          
          list = new ArrayList<>(list);
          for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
               System.out.print(iter.next() + '\t');
          }
          System.out.println();

          list = new LinkedList<>(list);
          for(Iterator<String> iter = list.iterator(); iter.hasNext(); ){
               System.out.print(iter.next() + '\t');
          }
          System.out.println();

     }
}
