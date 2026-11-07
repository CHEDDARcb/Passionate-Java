public class DDBox<U, D> {
     private U up;
     private D down;

     public void set(U u, D d){
          up = u;
          down = d;
     }

     @Override 
     public String toString(){
          return up + " \n" + down;
     }
}
