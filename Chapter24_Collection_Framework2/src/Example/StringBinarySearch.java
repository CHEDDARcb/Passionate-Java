import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class StringBinarySearch {
     public static void main(String[] args){
          List<String> list = new ArrayList<>();
          list.add("Box");
          list.add("Robot");
          list.add("Apple");

          Collections.sort(list);

          String key = "Robot";
          int idx = Collections.binarySearch(list, key);
          System.out.println(list.get(idx));
     }
}
