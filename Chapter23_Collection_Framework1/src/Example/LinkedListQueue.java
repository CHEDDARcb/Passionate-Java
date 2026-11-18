import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueue {
     public static void main(String[] args){
          Queue<String> que = new LinkedList<>();
          que.offer("box");
          que.offer("Toy");
          que.offer("Robot");

          System.out.println("Next: " + que.peek());

          System.out.println(que.poll());
          System.out.println(que.poll());

          System.out.println("next: " + que.peek());
          
          System.out.println(que.poll());
     }
}
