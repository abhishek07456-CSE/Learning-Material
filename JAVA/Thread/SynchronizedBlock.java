package JAVA.Thread;

public class SynchronizedBlock {
    static int user_count = 0; // user on site

    public static void newUser() {
        synchronized(SynchronizedBlock.class){
        user_count++;
        }
        System.out.println("total user " + user_count);
    }

    public static void main(String[] args) {
        Thread u1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            newUser();
        });
        Thread u2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            newUser();
        });
        Thread u3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            newUser();
        });
        u1.start();
        u2.start();
        u3.start();
    }
}
