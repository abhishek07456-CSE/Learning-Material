package JAVA.Thread;

public class SleepMainThread {
    public static void main(String[] args) {
        try{
            for(int i = 0 ; i < 10 ; i++){
              Thread.sleep(1000);
              System.out.println(i);
            }
        }catch(Exception e){
        }
    }
}
