import java.util.Arrays;

class Person3 implements Comparable{
     private String name;
     private int age;

     Person3(String nm, int ag){
          name = nm;
          age = ag;
     }

     @Override 
     public String toString(){
          return name + ": " + age;
     }

     @Override
     public int compareTo(Object o){
          Person3 p = (Person3)o;
          int lenThs = name.length();
          int lenTrgt = p.name.length();

          return lenThs > lenTrgt ? 1 :
               lenThs < lenTrgt ? -1 : 0;
     }
}

public class ModifySortingCriteria2 {
     public static void main(String[] args){
          Person3[] pAr = new Person3[3];

          pAr[0] = new Person3("jo", 28);
          pAr[1] = new Person3("naganum", 25);
          pAr[2] = new Person3("park", 61);

          Arrays.sort(pAr);
          for(Person3 p : pAr)
               System.out.println(p);
     }
}
