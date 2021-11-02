package JAVA.Exception;

public class withoutCatch {
    public static void fun(){
        int a  = 1/0;
    }
    public static void main(String[] args) {
        try{
            // int a = 1/0;
            fun();
        }catch(ArithmeticException e){
           System.out.println("Arith");
        }catch(Exception e){
            System.out.println("main");
        }finally{
            System.out.println("code finally run");
        }
        System.out.println("code finally run after finally");

    }
}
