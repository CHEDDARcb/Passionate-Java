import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;

public class IOExceptionCase2 {
     public static void main(String[] args){
          Path file = 
               Paths.get("C:\\Users\\dydtj\\Desktop\\Study\\Java\\Passionate_Java\\Chapter18_Exception_Handling\\Simple.txt");
          BufferedWriter writer = null;

          //writer = Files.newBufferedWriter(file);
          //writer.write('A');
          //writer.write('Z');
          //if(writer != null)
          //     writer.close();
     
     }
}
