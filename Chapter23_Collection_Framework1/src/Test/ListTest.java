import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;

class ListTest{
     public static void main(String[] args){
          List<String> list = new LinkedList<>();
          list.add("A");

          ListIterator<String> iter = list.listIterator();
          while(iter.hasNext())
               System.out.println(iter.next());
          
          while(iter.hasPrevious())
               System.out.println(iter.previous());
     }
}