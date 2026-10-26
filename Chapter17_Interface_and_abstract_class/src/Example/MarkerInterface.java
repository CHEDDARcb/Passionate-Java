public class MarkerInterface{
     public static void main(String[] args){
          Printer prn = new Printer();
          Report doc = new Report("Simple Funny News");
          prn.printContents(doc);
     }
}