public class Prn204Drv implements Printable{
     @Override 
     public void print(String doc){
          System.out.println("From MD-204 printer");
          System.out.println(doc);
     }
}
