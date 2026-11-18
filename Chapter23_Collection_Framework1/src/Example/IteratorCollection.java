import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorCollection {
     public static void main(String[] args){
          List<String> list = new LinkedList<>();
          list.add("Toy");
          list.add("Box");
          list.add("Robot");
          list.add("Box");

          Iterator<String> iter = list.iterator();
          while(iter.hasNext()){
               System.out.print(iter.next() + '\t');
          }
          System.out.println();

          iter = list.iterator();
          while(iter.hasNext()){
               String s = iter.next();
               if(s.equals("Box"))
                    iter.remove();
          }

          for(iter = list.iterator(); iter.hasNext();){
               System.out.print(iter.next() + '\t');
          }
     }
}
