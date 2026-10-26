public class PrinterDriver4 {
     public static void main(String[] args){
          String myDoc = "This is a report about...";
          Printable prn1 = new Prn731Drv();
          prn1.print(myDoc);
          System.out.println();

          Printable prn2 = new Prn909Drv();
          prn2.print(myDoc);
     }
}
