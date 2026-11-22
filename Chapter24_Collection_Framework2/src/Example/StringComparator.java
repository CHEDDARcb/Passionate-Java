import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

class StrComp implements Comparator<String>{
     @Override
     public int compare(String str1, String str2){
          return str1.compareTo(str2);
     }
}

public class StringComparator {
     public static void main(String[] args){
          List<String> list = new ArrayList<>();
          list.add("Robot");
          list.add("Box");
          list.add("Apple");

          Collections.sort(list);

          String key = "Robot";
          int idx = Collections.binarySearch(list, key);
          System.out.println(list.get(idx));
     }
}
