public class Rectangle {
     private Point ul;
     private Point dr;

     Rectangle(int x1, int y1, int x2, int y2){
          ul = new Point(x1, y1);
          dr = new Point(x2, y2);
     }

     @Override 
     public boolean equals(Object o){
          Rectangle r = (Rectangle) o;

          if(!(r instanceof Rectangle))
               return false;

          if(ul.equals(r.ul) && dr.equals(r.dr))
               return true;
          else
               return false;
     }
}
