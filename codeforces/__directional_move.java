import java.util.Scanner;

public class __directional_move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        char move[] = {'E','S','W','N'};
        while(t--!=0){
             int l = sc.nextInt();
             String s = sc.next();
             int i = 0;
             int ci = 0;
             while(i<l){
                 if(s.charAt(i) == '0')
                   ci = (ci+1)%4;
                else
                   ci = (ci == 0) ? 3:ci-1;
                i++;
            }
             System.out.println(move[ci]);
        }
    }
}

//E - S - W - N