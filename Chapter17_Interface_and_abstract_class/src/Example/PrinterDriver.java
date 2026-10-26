public class PrinterDriver {
     public static void main(String[] args){
          String myDoc = "This is a report about...";

          Printable prn = new SPrinterDirver();
          prn.print(myDoc);
          System.out.println();

          prn = new LPrinterDirver();
          prn.print(myDoc);
     }
}