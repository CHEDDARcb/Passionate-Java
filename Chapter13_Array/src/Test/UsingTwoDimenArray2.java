public class UsingTwoDimenArray2 {
     public static void SwapArray(int[][] arr){
          /* int[] tmp = arr[arr.length - 1];

          int[] prevTmp = arr[0];
          int[] curTmp;
          for(int i = 1; i < arr.length; ++i){
               curTmp = arr[i];
               arr[i] = prevTmp; 
               prevTmp = curTmp; 
          }
          arr[0] = tmp; */

          int[] tmp = arr[arr.length - 1];

          for(int i = arr.length - 1; i > 0; --i){
               arr[i] = arr[i - 1];
          }

          arr[0] = tmp;
     }
     
     public static void main(String[] args){
          int[][] arr = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9},
               {10, 11, 12, 13}
          };

          SwapArray(arr);

          for(int[] e : arr){
               for(int ee : e)
                    System.out.print(ee + "\t");
               System.out.println();
          }
     }
}
