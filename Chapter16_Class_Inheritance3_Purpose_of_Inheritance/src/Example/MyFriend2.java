public class MyFriend2 {
     public static void main(String[] args){
          Friend[] frns = new Friend[10];
          int cnt = 0;

          frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
          frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-333-555");
          frns[cnt++] = new UnivFriend("YOON", "R&D 1", "010-333-555");
          frns[cnt++] = new UnivFriend("PARK", "R&D 3", "010-333-555");

          for(int i = 0; i < cnt; ++i){
               frns[i].showInfo();
               System.out.println();
          }

     }
}
