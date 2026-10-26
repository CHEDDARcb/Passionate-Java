public interface Printable {
     String getContents();
     //void printLine(String str);
     /* static void printLine(String str){
          System.out.println(str);
     } */

     default void print(String doc){
          System.out.println(doc);
     }
     //default void printCMYK(String doc){}
}
