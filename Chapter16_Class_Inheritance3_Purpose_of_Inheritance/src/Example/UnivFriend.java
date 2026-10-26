public class UnivFriend extends Friend{
     private String major;

     public UnivFriend(String na, String ma, String ph){
          super(na, ph);
          major = ma;
     }

     public void showInfo(){
          super.showInfo();
          System.out.println("Major: " + major);
     }
}
