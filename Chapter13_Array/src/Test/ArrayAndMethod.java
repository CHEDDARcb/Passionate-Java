public class ArrayAndMethod {
     public static int minValue(int[] arr){
          int min = arr[0];
          for(var e : arr){
               if(min > e)
                    min = e;
          }
          return min;
     }

     public static int maxValue(int[] arr){
          int max = arr[0];
          for(int e : arr){
               if(max < e)
                    max = e;
          }
          return max;
     }

     public static void main(String[] args){
          int[] arr = {4, 3, 9, 10, 33, 2, 84, 2};

          System.out.println("min: " + minValue(arr));
          System.out.println("max: " + maxValue(arr));
     }
}
