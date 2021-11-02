import java.util.Scanner;

/*
Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.
*/
public class theatre_square {
    public static void main(String[] args) {
        long a,b,c;
        Scanner s = new Scanner(System.in);
        a = s.nextLong();
        b = s.nextLong();
        c = s.nextLong();
        long result = 0;
        if(a>=c){
            if(a%c==0)
            result = a/c;
            else
            result = a/c + 1;
        }else{
            result = 1;
        }
        if(b>=c){
            if(b%c==0)
            result *= b/c;
            else
            result *= b/c + 1;
        }
        System.out.println(result);

    }
}
