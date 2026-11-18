import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorCollection {
     public static void main(String[] args){
          List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
          list = new ArrayList<>(list);

          ListIterator<String> iter = list.listIterator();

          String str;
          while(iter.hasNext()){
               str = iter.next();
               System.out.print(str + '\t');
               if(str.equals("Toy"))
                    iter.add("Toy2");
          }
          System.out.println();

          while(iter.hasPrevious()){
               str = iter.previous();
               System.out.print(str + '\t');
               if(str.equals("Robot"))
                    iter.add("Robot2");
          }
           
     }
}
