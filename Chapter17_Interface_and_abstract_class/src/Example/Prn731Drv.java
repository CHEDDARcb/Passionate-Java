public class Prn731Drv implements Printable{
     @Override 
     public void print(String doc){
          System.out.println("From MD-731 printer");
          System.out.println(doc);
     }
}