import java.util.Scanner;

public class min_step_sum_k {
    static public int find_min_step(int n, int sum, int step, int last) {
       if(sum>=n){
        return step;
       }
       return Math.min(find_min_step(n,sum+last,step+1,last),find_min_step(n,sum+last,step+1,last+1));
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int n;
        while(t!=0){
          n = read.nextInt();
          System.out.println(find_min_step(n, 1,0, 1));
          t--;
        }
    }
}
