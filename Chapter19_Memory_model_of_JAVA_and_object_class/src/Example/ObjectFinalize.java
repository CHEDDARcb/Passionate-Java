class Person{
     String name;

     public Person(String name){

     }

     @Override
     protected void finalize() throws Throwable{
          super.finalize();
          System.out.println("destoryed: " + name);
     }
}

class ObjectFinalize{
     public static void main(String[] args){
          Person p1 = new Person("yoon");
          Person p2 = new Person("park");

          p1 = null;
          p2 = null;

          System.gc();
          System.runFinalization();
     }
}

