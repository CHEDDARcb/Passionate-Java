import java.util.Objects;
import java.util.HashSet;

class Person{
     private String name;
     private int age;

     public Person(String name, int age){
          this.name = name;
          this.age = age;
     }

     @Override 
     public String toString(){
          return name + "(" + age + "'s old)";
     }

     @Override 
     public int hashCode(){
          return Objects.hash(name, age);
     }

     @Override 
     public boolean equals(Object obj){
          Person po = (Person)obj;

          if(name.equals(po.name) && age == po.age)
               return true;
          else 
               return false;
     }
}

public class HashCodeNEqualsOverriding1 {
     public static void main(String[] args){
          HashSet<Person> set = new HashSet<>();

          set.add(new Person("JO", 28));
          set.add(new Person("JO", 28));
          set.add(new Person("Park", 28));
          set.add(new Person("Kim", 28));
          set.add(new Person("Choi", 28));

          for(Person p : set)
               System.out.println(p);
          
     }
}
