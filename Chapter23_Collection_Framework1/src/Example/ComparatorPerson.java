import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class Person3 implements Comparable<Person3>{
     String name;
     int age;

     public Person3(String name, int age){
          this.name = name;
          this.age = age;
     }

     @Override 
     public String toString() { return name + " : " + age; }

     @Override 
     public int compareTo(Person3 p){
          return this.age - p.age;
     }
}

class PersonComparator implements Comparator<Person3>{
     public int compare(Person3 p1, Person3 p2){
          return p2.age - p1.age;
     }
}

public class ComparatorPerson {
     public static void main(String[] args){
          Set<Person3> tree = new TreeSet<>(new PersonComparator());
          //Set<Person3> tree = new TreeSet<>();
          tree.add(new Person3("Yoon", 37));
          tree.add(new Person3("Hong", 53));
          tree.add(new Person3("Park", 22));

          for(Person3 p : tree)
               System.out.println(p);
          System.out.println();

     }
}
