package JAVA.Thread;

public class ByThreadLambda {
    public static void main(String[] args) {
        new Thread(
            ()->{
                while(true){
                    System.out.println("hello");
                }
            },
            "thread1"
        ).start();

        new Thread(
            ()->{
                while(true){
                    System.out.println("hye");
                }
            },
            "thread1"
        ).start();
    }
}
