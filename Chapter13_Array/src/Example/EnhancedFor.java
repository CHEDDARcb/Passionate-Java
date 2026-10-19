public class EnhancedFor {
     public static void main(String[] args){
          int[] arr = {1, 2, 3, 4, 5};

          for(int e : arr)
               System.out.print(e + " ");
          System.out.println();

          int sum = 0;
          for(int e : arr)
               sum += e;
          System.out.println(sum);
     }
}
