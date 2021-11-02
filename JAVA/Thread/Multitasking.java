package JAVA.Thread;
//perform task why multiple thread
public class Multitasking implements Runnable {
    static int i = 0;
    @Override
    public void run() {
      while(i<1000000000){
          System.out.println(Thread.currentThread().getName() + " " + i++);
      }
    }

    public static void main(String[] args) {
        Multitasking t1 = new Multitasking();
        Multitasking t2 = new Multitasking();
        Multitasking t3 = new Multitasking();
        new Thread(t1,"thread1").start();
        new Thread(t2,"thread2").start();
        new Thread(t3,"thread3").start();

    }

}
