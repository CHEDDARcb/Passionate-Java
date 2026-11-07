import java.util.Arrays;

class Person4 implements Comparable{
     String name;
     int age;

     public Person4(String nm, int ag){
          name = nm;
          age = ag;
     }

     @Override 
     public String toString(){
          return name + ": " + age;
     }

     @Override 
     public int compareTo(Object o){
          return name.compareTo(((Person4)o).name);
          /*
          Person4 p = (Person4)o;
          String shorterName;
          String longerName;
          if(this.name.length() < p.name.length()){
               shorterName = this.name;
               longerName = p.name;
          }
          else{
               shorterName = p.name;
               longerName = this.name;
          }
          
          int i = 0;
          for(; i < shorterName.length(); ++i){
               char shortC = shorterName.charAt(i);
               char longC = longerName.charAt(i);
               if(shortC > longC)
                    return 1;
               else if(shortC < longC)
                    return -1;
          }

          if(i < longerName.length()) return 1;
          else return 0;
          */
     }
}

public class ArrayObjSearch {
     public static void main(String[] args){
          Person4[] pAr = new Person4[4];
          pAr[0] = new Person4("jominsenua", 34);
          pAr[1] = new Person4("jominielasiosu", 32);
          pAr[2] = new Person4("jomzrio", 24);
          pAr[3] = new Person4("jo", 44);

          Arrays.sort(pAr);
          int idx = Arrays.binarySearch(pAr, new Person4("jo", 44));
          System.out.println(pAr[idx]);

          for(Person4 p : pAr){
               System.out.println(p);
          }
     }
}
