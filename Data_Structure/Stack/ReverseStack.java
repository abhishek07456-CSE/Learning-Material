package Data_Structure.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> stack  = new Stack <Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        reverse(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
     }

    private static void reverse(Stack<Integer> stack) {
        if(stack.empty()) return;
        int pop = stack.pop();
        reverse(stack);
        moveTBottom(stack ,pop);
    }

    private static void moveTBottom(Stack<Integer> stack , int Element) {
        if(stack.empty()){
            stack.push(Element);
            return;
        }
        int pop = stack.pop();
        moveTBottom(stack,Element);
        stack.push(pop);
    }
}
