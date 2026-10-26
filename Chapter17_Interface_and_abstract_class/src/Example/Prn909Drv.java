public class Prn909Drv implements Printable{
     @Override 
     public void print(String doc){
          System.out.println("From MD-909 black & white ver");
          System.out.println(doc);
     }

     @Override 
     public void printCMYK(String doc){
          System.err.println("From MD-909 CMYK ver");
          System.out.println(doc);
     }
}
