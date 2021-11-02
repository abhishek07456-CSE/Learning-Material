import java.util.Arrays;
import java.util.Scanner;

/*
You are given the programming skill of n students. The programming skill of ith student is ai.

You are given the duty of making teams for a programming competition. The skill level of a team is defined as the sum of the skills of the students in that team. The skill level of the team with only one student is the same as the skill of that student.

A team can have at most 2 students and the skill level of a team must be at least k.

3
5 8
9 3 4 4 5
5 8
5 2 3 5 1
3 6
7 6 8

output
3
1
3

*/
public class __maximum_team {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t--!=0){
        int n = sc.nextInt();
        int max = 0;
        int arr[] = new int[n];
        int k = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l = 0;
        int r = n -1;
        while(l<=r){
            if(arr[r]>=k){
                max++;
                r--;
            }else if(r!=l && arr[r]+arr[l]>=k){
                max++;
                r--;
                l++;
            } else{
                l++;
            }
        }
        System.out.println(max);

    }
}
}
