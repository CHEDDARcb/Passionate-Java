public class Friend {
     protected String name;
     protected String phone;

     public Friend(String nm, String ph){
          name = nm;
          phone = ph;
     }

     public void showInfo(){
          System.out.println("Name: " + name);
          System.out.println("Phone: " + phone);
     }
}
