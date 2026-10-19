class Person{
     private int regiNum;
     private int passNum;

     Person(int rnum, int pnum){
          regiNum = rnum;
          passNum = pnum;
     }

     Person(int rnum){
          this(rnum, 0);
     }

     void showPersonalInfo(){
          System.out.println("주민번호: " + regiNum);

          if(passNum != 0)
               System.out.println("여권번호: " + passNum);
          else
               System.out.println("여권 없음");
     }
}

public class ConOverloading{
     public static void main(String[] args){
          Person jung = new Person(335577, 112233);

          Person hong = new Person(775544);

          jung.showPersonalInfo();
          hong.showPersonalInfo();
     }
}