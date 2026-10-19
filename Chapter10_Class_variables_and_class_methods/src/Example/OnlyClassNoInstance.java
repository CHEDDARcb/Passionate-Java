class Inst{
     static int instNum = 1000;

     Inst(){
          instNum++;
          System.out.println("인스턴스 생성: " + instNum);
     }
}

public class OnlyClassNoInstance {
     public static void main(String[] args){
          InstCnt.instNum -= 15;
          System.out.println(InstCnt.instNum);
     }
}
