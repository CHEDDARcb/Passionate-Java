public class MultiPrinter extends SimplePrinter{
     public void printLine(String str){
          super.printLine("Start of multi...");
          super.printLine(str);
          super.printLine("end of multi");
     }
}
