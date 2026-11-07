import java.util.Arrays;

class Person2 implements Comparable{
     private String name;
     private int age;

     public Person2(String nm, int ag){
          name = nm;
          age = ag;
     }

     @Override
     public String toString(){
          return name + ": " + age;
     }

     @Override 
     public int compareTo(Object o){
          Person2 p = (Person2)o;

          return this.age > p.age ? -1 :
                this.age < p.age ? 1 : 0;
     }
}

public class ModifySortingCriteria1 {
     public static void main(String[] args){
          Person2[] pAr = new Person2[3];

          pAr[0] = new Person2("jo", 28);
          pAr[1] = new Person2("naganum", 25);
          pAr[2] = new Person2("park", 61);

          Arrays.sort(pAr);
          for(Person2 p : pAr)
               System.out.println(p);
     }
}
