package Data_Structure.Stack;

import java.text.NumberFormat.Style;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack <Integer> stack  = new Stack <Integer>();
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        sortStack(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    private static void sortStack(Stack<Integer> stack) {
        if(stack.empty()) return;
        int Element = stack.pop(); //empty all stack
        sortStack(stack);
        moveMinAtBottom(stack , Element); // now move element at stack if bigger lower element found then move it to bottom
    }

    private static void moveMinAtBottom(Stack<Integer> stack , int Element) {
        if(stack.empty()){
            stack.push(Element);
            return;
        } else if (stack.peek() <= Element){ // if current Element is greater then top of stack then move it to stack then return
            stack.push(Element);
            return;
        }else{
            int popped = stack.pop(); // pop higher element until lower not found at top of stack or not empty
            moveMinAtBottom(stack,Element);
            stack.push(popped); // push all higher element that are pop to move lower element at correct position
        }
    }
}
