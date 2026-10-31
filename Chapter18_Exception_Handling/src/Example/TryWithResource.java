import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class TryWithResource {
     public static void main(String[] args){
          Path file = Paths.get("C:\\\\Users\\\\dydtj\\\\Desktop\\\\Study\\\\Java\\\\Passionate_Java\\\\Chapter18_Exception_Handling\\\\Simple.txt");
          
          try(BufferedWriter writer = Files.newBufferedWriter(file)){
               writer.write('a');
               writer.write('z');
          }
          catch(IOException e){
               e.printStackTrace();
          }
     }
}
