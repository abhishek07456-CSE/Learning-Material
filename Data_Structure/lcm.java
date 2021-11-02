public class lcm {
    public static void main(String[] args) {
        int a =6,b=9;
        // int i = 2;
        // int r = 1;
        // byte exists = 0;
        // while(a>1 || b>1){
        //    if(a%i==0){
        //     a/=i;
        //     exists =1;
        //    }
        //    if(b%i==0){
        //        b/=i;
        //        exists =1;
        //    }
        //    if(exists == 1)
        //     r*=i;
        //    else
        //     i++;
        //     exists = 0;
        // }
        int i =b;
        while(true){
           if(i%a==0) break;
           i+=b;

        }
        System.out.println(i);
    }
}
