import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeue {
     public static void main(String[] args){
          Deque<String> deq = new ArrayDeque<>();

          deq.offer("1. Box");
          deq.offer("2. Toy");
          deq.offer("3. Robot");

          System.out.println(deq.pollFirst());
          System.out.println(deq.pollFirst());
          System.out.println(deq.pollFirst());
     }
}
