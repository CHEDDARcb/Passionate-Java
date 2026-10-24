public class Wrapping {
     public static void main(String[] args){
          Box box1 = new Box();
          PaperBox box2 = new PaperBox();
          GoldPaperBox box3 = new GoldPaperBox();

          wrapBox(box1);
          wrapBox(box2);
          wrapBox(box3);

          System.out.println();
          
          Box[] boxes = {new Box(), new PaperBox(), new GoldPaperBox()};

          for(Box b : boxes){
               b.ov();
          }
     }

     public static  void wrapBox(Box box){
          if(box instanceof GoldPaperBox){
               ((GoldPaperBox)box).goldWrap();
          }
          else if(box instanceof PaperBox){
               ((PaperBox)box).paperWrap();
          }
          else{
               box.SimpleWrap();
          }
     }
}
