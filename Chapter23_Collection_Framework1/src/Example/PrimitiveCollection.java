import java.util.LinkedList;
import java.util.Iterator;

public class PrimitiveCollection {
     public static void main(String[] args){
          LinkedList<Integer> list = new LinkedList<>();
          list.add(10); list.add(20); list.add(30);
          
          int n;
          for(Iterator<Integer> iter = list.iterator(); iter.hasNext(); ){
               n = iter.next();
               System.out.print(n + "\t");
          }
     }
}
