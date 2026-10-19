public class UsingTwoDimenArray1 {
     public static void addTowDArr(int[][] arr, int add){
          for(int i = 0; i < arr.length; ++i){
               for(int j = 0; j < arr[i].length; ++j){
                    arr[i][j] += add;
               }
          }
     }

     public static void main(String[] args){
          int[][] arr = {
               {1, 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12}
          };

          addTowDArr(arr, 10);

          for(int[] e : arr){
               for(int ee : e){
                    System.out.print(ee + "\t");
               }
               System.out.println();
          }
     }
}
