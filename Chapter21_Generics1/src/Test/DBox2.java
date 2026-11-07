public class DBox2<L, R> {
     private L left;
     private R right;

     public void set(L l, R r){
          left = l;
          right = r;
     }

     @Override 
     public String toString(){
          return left + " & " + right;
     }
}
