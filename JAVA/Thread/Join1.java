package JAVA.Thread;

public class Join1 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i = i + 1) {
                System.out.println("thread 1 - " + i);
            }
        }, "thread1");

       Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i = i + 1) {
                System.out.println("thread 2- "+i);
            }
        }, "thread2");
        t1.start();
        t1.join();
        t2.start();
        t2.join(); //main thread wait for t2 complete then print otherwise it print parallels if not wait
        System.out.println("hello");

    }
}
