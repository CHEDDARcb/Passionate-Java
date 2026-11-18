import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Iter {
     public static void main(String[] args){
          List<String> list = new LinkedList<>();
          list.add("Toy");
          list.add("Box");
          list.add("Robot");

          Iterator<String> iter = list.iterator();
          while(iter.hasNext()){
               System.out.print(iter.next() + '\t');
          }
     }    
}
