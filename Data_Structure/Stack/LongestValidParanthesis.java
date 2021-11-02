package Data_Structure.Stack;

import java.util.Stack;

public class LongestValidSubstring {
    public static void main(String[] args) {
        System.out.println(stackMethod("(()()"));
        System.out.println(stackMethod("((()())"));
    }
    public static int twoVariable(String s){
        int left = 0;
        int right = 0;
        int max = 0;
        int l  = s.length();
        for(int i = 0 ; i < l ; i++){
            if(s.charAt(i) =='(')
                left++;
            else
                right++;
            if(left == right){
                max = Math.max(max , 2*left);
            }
            else if(right>left){ // eg (()
                left = 0;
                right = 0;
            }
        }
        left = 0;right = 0;
         for(int i = l - 1 ; i >=0 ; i--){
            if(s.charAt(i) =='(')
                left++;
            else
                right++;
            if(left == right){
                max = Math.max(max , 2*left);
            }
            else if(right<left){// eg ())
                left = 0;
                right = 0;
            }
        }
        return max;
    }
    public static int stackMethod(String S){
        Stack <Integer> stack = new Stack <Integer> ();
        int l = S.length();
        int i = 0;
        int max = 0;
        stack.push(-1);//-1 USED OF STRING VALID FROM STARTING
        while(i < l){
            int t = stack.peek();
            if(t!=-1 && S.charAt(stack.peek()) == '(' && S.charAt(i) == ')'){
                stack.pop();
                int d = i - stack.peek();
                 /*eg () => 1 - (-1) = 2
                      (()() =>  max =2-0 =2 => (--() => max = 4 - 0 =4
                  */
                if(d > max) max = d;
            }
            else
            stack.push(i);
            i++;
        }
        return max;
    }
}
