package JAVA.Thread;
//NOT WORKING NEED TO DESIGN EFFICIENT WAY
public class EvenOddSequenceSleep {
    public static void main(String[] args) {
        Thread odd = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i = i + 2) {
                    Thread.sleep(1000);
                    System.out.println("odd -" + i);
                }

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }, "oddThread");
        odd.start();

        Thread even = new Thread(() -> {
            try {
                for (int i = 2; i <= 10; i = i + 2) {
                    Thread.sleep(1000);

                    System.out.println("even -" + i);
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }, "evenThread");
        even.start();
    }
}
