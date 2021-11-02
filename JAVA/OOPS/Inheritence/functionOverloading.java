package JAVA.OOPS.Inheritence;

public class functionOverloading {
    public static void sum(int a , float b){
        System.out.println("int,int");
    }
    public static void sum(float a , int b){
        System.out.println("float,float");
    }
    public static void main(String[] args) {
        sum(4 ,4.5f);
    }
}
