public class MyFriends {
     public static void main(String[] args){
          UnivFriend[] ufrns = new UnivFriend[5];
          int ucnt = 0;

          CompFriend[] cfrns = new CompFriend[5];
          int ccnt = 0;

          ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
          ufrns[ucnt++] = new UnivFriend("Park", "Electornics", "010-222-444");

          cfrns[ccnt++] = new CompFriend("Yoon", "R&D 1", "02-123-999");
          cfrns[ccnt++] = new CompFriend("Park", "R&D 2", "02-321-777");

          for(int i = 0; i < ucnt; ++i){
               ufrns[i].showInfo();
               System.out.println();
          }

          for(int i = 0; i < ccnt; ++i){
               cfrns[i].showInfo();
               System.out.println();
          }
          
     }
}
