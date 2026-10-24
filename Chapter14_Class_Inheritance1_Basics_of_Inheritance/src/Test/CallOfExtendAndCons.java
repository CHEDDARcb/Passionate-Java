class Car{
     int gasolineGauge;

     public Car(int gasolGauge){
          gasolineGauge = gasolGauge;
     }
}

class HybirdCar extends Car{
     int eletricGauge;

     public HybirdCar(int gas, int el){
          super(gas);
          eletricGauge = el;
     }
}

class HybirdWaterCar extends HybirdCar{
     int waterGauge;

     public HybirdWaterCar(int gas, int el, int water){
          super(gas, el);
          waterGauge = water;
     }

     public void showCurrentGauge(){
          System.out.println("잔여 가솔린" + gasolineGauge);
          System.out.println("잔여 전기량" + eletricGauge);
          System.out.println("잔여 워터량" + waterGauge);
     }

}

public class CallOfExtendAndCons {
     public static void main(String[] args){
          HybirdWaterCar hwc = new HybirdWaterCar(10, 12, 13);
          hwc.showCurrentGauge();
     }
}
