public class Report implements Printable, Upper{
     String cons;

     Report(String cons){
          this.cons = cons;
     }
     public String getContents(){
          return cons;
     }
}
