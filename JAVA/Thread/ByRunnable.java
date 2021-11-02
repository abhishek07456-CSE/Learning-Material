package JAVA.Thread;

public class ByRunnable{
      public static void main(String[] args) {
          Runnable r1 = new Runnable(){
              @Override
              public void run(){
                while(true){
                    System.out.println("hello");
                }
              }
          };

          Runnable r2 = ()-> {
            while(true){
                System.out.println("hi");
            }
          };
          new Thread(r1,"thread1").start();
          new Thread(r2,"thread2").start();

      }
}
