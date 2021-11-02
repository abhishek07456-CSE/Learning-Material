package JAVA.Thread;

public class waitNotify  extends Thread{
    static int total = 0;
    public void run(){
        synchronized(this){
            for(int i = 1 ; i <= 10 ; i++){
                total += 100;
            }
           this.notify();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        waitNotify t = new waitNotify();
        t.start();
        synchronized(t){
            t.wait();
            System.out.println("Total = " + waitNotify.total);
        }

    }
}
