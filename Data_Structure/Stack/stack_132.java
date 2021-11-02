package Data_Structure.Stack;

import java.util.Stack;

public class stack_132 {
    public static boolean find132pattern(int[] arr) {
        int n = arr.length;
        Stack <Integer> stack = new Stack <Integer>();
         int min[] = new int[n];
         min[0] = arr[0];
         for(int i = 1 ; i < n ; i++){
             min[i] = Math.min(arr[i] , min[i-1]);
         }
         for(int i = n - 1 ; i > 0 ; i--){
             while(!stack.empty() && stack.peek() <= min[i-1])
             stack.pop();
             if(!stack.empty() && stack.peek() < arr[i]) return true;
             stack.push(arr[i]);
         }
         return false;
     }
     // o(n3) three four loop then check
     // (n2) fix j , k and find lowest min i

     public static boolean find132patternO2(int[] arr){
        int n = arr.length;
         int min[] = new int[n];
         min[0] = arr[0];
         for(int i = 1 ; i < n ; i++){
             min[i] = Math.min(arr[i] , min[i-1]);
         }
         for(int j = 1 ; j < n ; j++){
             for(int k = j + 1 ; k < n ;k++){
                 if(arr[j] > arr[k] && min[j-1] < arr[k]) return true;
             }
         }
         return false;
     }
    public static void main(String[] args) {
       int arr[] = {6,2,3,8,1,1,7};
       System.out.println(find132pattern(arr));
    }
}