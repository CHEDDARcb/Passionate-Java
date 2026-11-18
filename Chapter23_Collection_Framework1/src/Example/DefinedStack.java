import java.util.Deque;
import java.util.ArrayDeque;

interface DIStack<E> {
     public E pop();
     public boolean push(E item);
}

class DCStack<E> implements DIStack<E>{
     private Deque<E> stack;

     public DCStack(ArrayDeque<E> d) { stack = d; }

     public E pop(){
          return stack.pollLast();
     }

     public boolean push(E item){
          return stack.offerLast(item);
     }
}

public class DefinedStack {
     public static void main(String[] args){
          DCStack<String> stack = new DCStack<>(new ArrayDeque<>());

          stack.push("1. Box");
          stack.push("2. Toy");
          stack.push("3. Robot");

          System.out.println(stack.pop());
          System.out.println(stack.pop());
          System.out.println(stack.pop());
     }
}
