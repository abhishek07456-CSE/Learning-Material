package JAVA.Thread;

class even {

}

public class evenOdd {
    static int start = 1;
    static int end = 10;
    synchronized void printEven() throws InterruptedException{
        while(start < end){
            //continuously wait when odd
              while(start%2==1){
                  wait(1000);
              }
              System.out.println(Thread.currentThread().getName() + " -  " + start);
              start++;
              notify();
        }
    }
    synchronized void printOdd() throws InterruptedException{
        while(start < end){
            //continuously wait when even
              while(start%2==0){
                  wait(1000);
              }
              System.out.println(Thread.currentThread().getName() + " -  " + start);
              start++;
              notify();
        }
    }

    public static void main(String[] args) {
        evenOdd obj = new evenOdd();
        Thread odd = new Thread(()->{
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"ODD");
        Thread even = new Thread(()->{
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"Even");
        odd.start();
        even.start();


    }
}
