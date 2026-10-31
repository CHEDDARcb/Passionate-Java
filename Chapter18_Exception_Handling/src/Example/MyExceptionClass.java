import java.util.Scanner;

class ReadAgeException extends Exception{
     public ReadAgeException(){
          super("유효하지 않은 나이가 입력되었습니다.");
     }
}

public class MyExceptionClass {
     public static void main(String[] args){
          System.out.print("Input Age: ");

          try{
               int age = readAge();
               System.out.printf("Inputed Age: %d", age);
          }
          catch(ReadAgeException e){
               System.out.println(e.getMessage());
          }
     }

     public static int readAge() throws ReadAgeException{
          Scanner kb = new Scanner(System.in);
          int age = kb.nextInt();

          if(age < 0){
               throw new ReadAgeException();
          }

          return age;
     }
}
