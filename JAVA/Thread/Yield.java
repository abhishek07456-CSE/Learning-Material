package JAVA.Thread;

public class Yield {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i = i + 1) {
                if(i==2) {
                    Thread.currentThread();
                    Thread.yield();
                }
                System.out.println("thread 1 - " + i);
            }
        }, "thread1");
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i = i + 1) {
                System.out.println("thread 2- "+i);
            }
        }, "thread2");
        t1.start();
        t2.start();
    }
}
