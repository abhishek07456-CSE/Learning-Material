package JAVA.Thread;

public class Interrupt {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                // Thread.currentThread();
                // System.out.println(Thread.interrupted()); //if thread interupt then restart
                // from waiting to runnable state
                // //first return return because thread in intrupt then clear status from true
                // to false
                for (int i = 0; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.currentThread();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("IN CATCH");
                e.printStackTrace();
            }
        });
        System.out.println("THREAD START");
        t.start();
        t.interrupt();
        // System.out.println("MAIN THREAD RUNNING");

    }
}
