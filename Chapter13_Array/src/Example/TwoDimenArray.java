public class TwoDimenArray {
     public static void main(String[] args){
          int[][] arr = new int[3][4];
          int n = 1;

          for(int i = 0; i < arr.length; ++i){
               for(int j = 0; j < arr[i].length; ++j){
                    arr[i][j] = n++;
               }
          }

          for(int[] e1 : arr){
               for(int e2 : e1){
                    System.out.print(e2 + "\t");
               }
               System.out.println();
          }
     }
}
