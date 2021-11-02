public class print_prime_number {
    public static void main(String[] args) {
        int n = 24;
        print_prime(n);
    }

    public static void print_prime(int n) {
        if(n<2){
            System.out.println(n);
            return;
        }

        while(n%2 == 0){
            System.out.println(2);
            n/=2;
        }
        for(int i =3 ;i<=Math.sqrt(n);i=i+2){
           while(n%i==0){
            System.out.println(i);
            n/=i;
           }
        }
        if(n>2)
        System.out.println(n);

    }
}
