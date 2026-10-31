import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOExceptionCase3 {
     public static void main(String[] args){
          try{
               md1();
          }
          catch(IOException e){
               e.printStackTrace();
          }
     }

     public static void md1() throws IOException{
          md2();
     }

     public static void md2() throws IOException{
          Path file =
               Paths.get("C:\\\\Users\\\\dydtj\\\\Desktop\\\\Study\\\\Java\\\\Passionate_Java\\\\Chapter18_Exception_Handling\\\\Simple.txt");
          BufferedWriter writer = null;
          writer = Files.newBufferedWriter(file);
          writer.write('a');
          writer.write('z');

          if(writer != null)
               writer.close();
     }

}
