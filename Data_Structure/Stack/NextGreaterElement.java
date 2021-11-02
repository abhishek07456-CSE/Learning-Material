package Data_Structure.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        // 7 8 1 2 4
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!s.empty() && arr[s.peek()] < arr[i]) { //check current element is greater of top element
                arr[s.pop()] = arr[i]; // update reaming index with this next greater element
            }
            s.push(i);
        }
        while (!s.empty()) {
            arr[s.pop()] = -1; // left element is stack have not found any next greater
        }
        return arr;
    }

    public static void main(String[] args) {
        long[] arr = { 17,18,5,4,6,1 };
        nextLargerElement(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
