public class PersonalInfo implements Cloneable{
     private Business bz;
     private String name;
     private int age;

     public PersonalInfo(String nm, int ag, String comp, String wok){
          name = nm;
          age = ag;
          bz = new Business(comp, wok);
     }

     public void changeInfo(String nm, int ag, String comp, String wok){
          name = nm;
          age = ag;
          bz.changeInfo(comp, wok);
     }

     public void showPersonalInfo(){
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
          bz.showBusinessInfo();
          System.out.println();
     }

     @Override 
     public PersonalInfo clone() throws CloneNotSupportedException{
          PersonalInfo cpy = (PersonalInfo)super.clone();
          cpy.bz = (Business)bz.clone();
          cpy.name = new String(name);

          return cpy;
     }
}
