import java.util.TreeSet;
import java.util.Objects;

class Person2 implements Comparable<Person2>{
     private String name;
     private int age;

     public Person2(String nm, int ag){
          name = nm;
          age = ag;
     }

     @Override 
     public String toString(){
          return name + "(" + age + "years old)";
     }

     @Override 
     public int hashCode(){
          return Objects.hash(name, age);
     }

     @Override 
     public boolean equals(Object obj){
          Person2 po = (Person2)obj;

          if(name.equals(po.name) && age == po.age)
               return true;
          else
               return false;
     }

     @Override 
     public int compareTo(Person2 p){
          if(this.equals(p)) return 0;
          else if(age > p.age) return 1;
          else return -1;
     }
}

public class ComparablePerson {
     public static void main(String[] args){
          TreeSet<Person2> set = new TreeSet<>();
          set.add(new Person2("YOON", 37));
          set.add(new Person2("HONG", 53));
          set.add(new Person2("PARK", 22));

          for(Person2 p : set)
               System.out.println(p);
     }
}
