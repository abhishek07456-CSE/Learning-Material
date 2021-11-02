
import java.util.Scanner;

/*
eg 100 then 10
   10  then  3

   100
   50*50 > 100
   0, 50
   25*25 > 100
   0, 25
   12*12 > 100
   0, 12
   6*6  < 100
   6,12
   9
*/
public class square_root_big_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int srt = sc.nextInt();
        int count = 0;
        while(srt>1){
            srt/=2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
