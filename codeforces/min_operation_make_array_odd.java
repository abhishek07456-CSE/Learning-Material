import java.util.Scanner;

/*
You are given an array of n integers. You want to make all the numbers in this array as odd.
In one operation you can select two indices i and j (i≠j) and replace ai with (ai+aj).
Find the minimum number of operations needed to make all the numbers odd. If there is no way to do it, then print −1.

4
4
1 4 3 2
5
1 4 3 2 5
6
1 2 6 5 3 4
3
4 2 6

output
2
2
-1

*/
public class min_operation_make_array_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int odd = -1;
            int min = 0;
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
                if(arr[i]%2==1)
                  odd = arr[i];
            }
            if(odd == -1)
             System.out.println("-1");
            else{
                for(int i = 0 ; i < n ; i++){
                        if(arr[i]%2==0){
                            min++;
                        }
                }
                System.out.println(min);
            }

        }
    }

}
