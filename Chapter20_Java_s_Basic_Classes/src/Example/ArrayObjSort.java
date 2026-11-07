import java.util.Arrays;

class Person implements Comparable{
     private String name;
     private int age;

     public Person(String nm, int ag){
          name = nm;
          age = ag;
     }

     @Override
     public String toString(){
          return name + ": " + age;
     }

     @Override 
     public int compareTo(Object o){
          Person p = (Person)o;

          return this.age > p.age ? 1 :
                this.age < p.age ? -1 : 0;
     }
}

public class ArrayObjSort {
     public static void main(String[] args){
          Person[] pAr = new Person[3];

          pAr[0] = new Person("jo", 28);
          pAr[1] = new Person("naganum", 25);
          pAr[2] = new Person("park", 61);

          Arrays.sort(pAr);
          for(Person p : pAr)
               System.out.println(p);
     }
}
