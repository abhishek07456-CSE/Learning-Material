package JAVA.Thread;

public class ByThread extends Thread {
    @Override
    public void run(){
        int i = 0;
        // synchronized(ByThread.class){
         while(i<1000){
             System.out.println(this.getName() + " " + i);
             i++;
         }
        // }
    }
   public static void main(String[] args) {
       ByThread thread1= new ByThread();
       thread1.setName("thread1");
       thread1.setPriority(2);
       thread1.start();
       ByThread thread2= new ByThread();
       thread2.setName("thread2");
       thread2.start();
       thread2.setPriority(1);

   }
}
