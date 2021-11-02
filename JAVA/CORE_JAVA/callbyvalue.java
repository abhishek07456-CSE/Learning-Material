public class callbyvalue {
    public static void main(String[] args) {
        int x =5 ;
        System.out.println("primitive data type before call by value" + x);
        call_by_value(x);
        System.out.println("primitive data type after call by value" + x);

        String s = "hello";
        System.out.println("non primitive data type before call by value " + s);
        call_by_value(s);
        System.out.println("non primitive data type after call by value " + s);


        int arr[]  = {1,2,3,4,5};
        System.out.println("non primitive data type before call by value " + arr[0]);
        call_by_value(arr);
        System.out.println("non primitive data type after call by value " + arr[0]);

    }

    public static void call_by_value(int[] arr) {
          arr[0] =5;
    }

    public static void call_by_value(String s) {
        s = "world";
    }

    public static void call_by_value(int x) {
        x =10;
    }
}
