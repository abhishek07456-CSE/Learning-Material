package Data_Structure.Stack;
import java.util.*;
public class infixToPostfixToPrefix {

    public static String reverse(String s){
        char arr[] = s.toCharArray();
        int l = 0;
        int r = s.length() -1;
        while(l<r){
           char c = arr[l];
           arr[l] = arr[r];
           arr[r] = c;
           l++;
           r--;
        }

        return String.valueOf(arr);
    }
    public static int precedence(char c){
        if(c=='^') return 3;
        else if(c == '*' || c=='/') return 2;
        return 1;
    }
    public static String infixTPostfix(String s){
           Stack <Character> stack = new Stack <Character>();
           int l = s.length();
           String result = "";
           for(int i = 0 ; i < l ; i++){
              if(Character.isLetterOrDigit(s.charAt(i)))
               result += s.charAt(i);
              else if(s.charAt(i) == '(')
               stack.push(s.charAt(i));
              else if(s.charAt(i) == ')'){
                  while(!stack.empty() && stack.peek() !='('){
                       result += stack.pop();
                  }
                  stack.pop();
              } else {
                  while(!stack.empty() &&  stack.peek()!='(' && precedence(stack.peek()) >= precedence(s.charAt(i))){
                     result += stack.pop();
                  }
                  stack.push(s.charAt(i));
              }
           }
           while(!stack.empty()){
             result += stack.pop();
           }
           return result;
    }
    public static void infixPrefix(String s){
             StringBuffer st = new  StringBuffer(s);
             for(int i = 0 ; i < st.length() ;i++){
                 if(st.charAt(i) == ')')
                   st.setCharAt(i,'(');
                 else if(st.charAt(i) == '(')
                   st.setCharAt(i,')');
             }
             st.reverse();
             st = new StringBuffer(infixTPostfix(String.valueOf(st)));
             st.reverse();
             System.out.println(String.valueOf(st));
    }
    public static String PostfixInfix(String s){
      int l = s.length();
      Stack <String> stack = new Stack <String>();
      try{
        for(int i = 0 ; i < l ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stack.push(Character.toString(s.charAt(i)));
            }else{
                stack.push("(" + stack.pop() + s.charAt(i) + stack.pop() +")");
            }
        }
     }catch(Exception e){
               System.out.println(e.getMessage());
     }
      System.out.println(stack.peek());
      return  stack.peek();
    }
    public static void prefixInfix(String s){
        StringBuffer st = new  StringBuffer(s);
        st.reverse();
        PostfixInfix(String.valueOf(st));
    }
    public static void main(String[] args) {
        // String s = "(a+b+c)/d";
        // infixTPostfix(s);

        // String s = "ab+c*";
        // PostfixInfix(s);

        // String s = "(a*b+c)/d";
        // infixPrefix(s);

        String s = "/*+abcd";
        prefixInfix(s);

    }
}
