import java.util.Arrays;

class INum implements Cloneable{
     private int num;

     public INum(int n){
          num = n;
     }

     @Override
     public boolean equals(Object obj){
          if(num == ((INum)obj).num)
               return true;
          else
               return false;
     }
}

public class ArrayObjEquals {
     public static void main(String[] args){
          INum[] org = new INum[5];
          INum[] cpy = new INum[5];

          for(int i = 0; i < 5; ++i){
               org[i] = new INum(i + 1);
               cpy[i] = new INum(i + 1);
          }

          System.out.println(Arrays.equals(org, cpy));
     }
}