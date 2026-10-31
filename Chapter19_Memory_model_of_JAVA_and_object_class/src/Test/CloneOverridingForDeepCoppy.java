public class CloneOverridingForDeepCoppy {
     public static void main(String[] args){
          PersonalInfo pi1 = new PersonalInfo("JO", 28, "i-vinci", "SE");
          PersonalInfo pi2;

          try{
               pi2 = pi1.clone();

               pi1.changeInfo("Park", 60, "Incheon", "Boss");

               pi1.showPersonalInfo();
               pi2.showPersonalInfo();
          }
          catch(CloneNotSupportedException e){
               e.printStackTrace();
          }
     }
}
