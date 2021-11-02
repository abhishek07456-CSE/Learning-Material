public class poly_function_overloading {
    static int sum(int a ,int b){
        // System.out.println("int type called");
        return a+b;
    }
    // static String sum(String a ,String b){
    //     System.out.println("String type called");
    //     return a+b;
    // }
    static double sum(double a , double b){
        return  a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum('a','b'));
        System.out.println(sum(1.1,1.2));

    }
}
