class SiniveCap{
     void take(){
          System.out.println("콧물 싹");
     }
}

class SneezeCap{
     void take(){
          System.out.println("재채기 싹");
     }
}

class SnuffleCap{
     void take(){
          System.out.println("코가 뻥");
     }
}

class SinusCap{
     SiniveCap siCap = new SiniveCap();
     SneezeCap szCap = new SneezeCap();
     SnuffleCap sfCap = new SnuffleCap();

     void take(){
          siCap.take();
          szCap.take();
          sfCap.take();
     }
}

class ColdPatient{
     void takeSinus(SinusCap cap){
          cap.take();
     }
}

public class CompEncapsulation {
     public static void main(String[] args){
          ColdPatient suf = new ColdPatient();
          suf.takeSinus(new SinusCap());
     }
}
