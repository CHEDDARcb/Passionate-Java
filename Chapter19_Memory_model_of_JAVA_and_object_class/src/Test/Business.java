public class Business implements Cloneable{
     private String company;
     private String work;

     public Business(String com, String wok){
          company = com;
          work = wok;
     }

     public void changeInfo(String comp, String wok){
          company = comp;
          work = wok;
     }

     public void showBusinessInfo(){
          System.out.println("Company: " + company);
          System.out.println("Work: " + work);
     }

     @Override 
     public Business clone() throws CloneNotSupportedException{
          Business cpy = (Business)super.clone();

          cpy.company = new String(company);
          cpy.work = new String(work);

          return cpy;
     }
}
