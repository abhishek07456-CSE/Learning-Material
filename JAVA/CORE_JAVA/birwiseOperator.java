public class birwiseOperator {
    public static void even_odd(){
        int a = 4;
        /*check odd even
           4 100 & 001 = 0
           5 101 & 001 = 1
        */
        System.out.println(a&1);
    }

    public static void swapM1(){
          int a=5;
          int b=7;
          int temp;
          /* using temp variable
           in ths method will take extra memory
          */
          temp = a;
          a = b;
          b = temp;
          System.out.println("a="+a+",b="+b);
    }
    public static void swapM2(){
        int a=5;
        int b=7;
        /*
             a=a*b => 5*7
             b = a/b => a*b/b =>a  i.e 5*7/7 => 5
             a = a/b => a*b/a =>b  i.e 5*7/5 => 7
        */
        a= a*b;
        b =a/b;
        a =a/b;
        System.out.println("a="+a+",b="+b);
   }
   public static void swapM3(){
        int a=5;
        int b=7;
          /*
             a= a^b => 5^7 => 101 ^ 111 => 010 -> 2
             b => a^b =>(a^b)^b  i.e 5^7^7 => 5 (i.e same bit become zero in 7^7)
             a = a^b => (a^b)^a =>b  i.e 5^7^5 => 7
        */
        a =a^b;
        b= a^b;
        a =a^b;
        System.out.println("a="+a+",b="+b);

   }
   public static void findUnique(){
    int a[] = {1,1,2,3,3};
    int sum = 0;
    for(int i=0;i<=4;i++)
    sum ^=a[i];
    System.out.println(sum);
   }
   public static void oppositeSign(){
       int a = 2;
       int b = -2;
       /*
           0 00000010
           1 00000010
           2's complment

           0 00000010
           0 11111110
           xor
           0 11111100 - 2'w complment => 1 00000100 ie -4
       */
      System.out.println(a^b);
      System.out.println(a&b);
      System.out.println(a^1);

   }

    public static void main(String[] args) {
       //swapM1();
       // swapM2();
       // swapM3();
    //    findUnique();
    // oppositeSign();
    //    fib(0,1,22);
       System.out.println(Math.min(Double.MIN_VALUE, 0.0d));


    }

    public static void fib(int i, int j, int k) {
        if(j>k) return;
        fib(j,i+j,k);
        System.out.println(i);
    }
}
