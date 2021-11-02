package Data_Structure.Stack;

import java.util.Stack;

public class maximumHistogram {
    public static void main(String[] args) {
        long arr[] = {6,2,5,4,5,1,6};
        System.out.println(maximumArea(arr, arr.length));
    }

    public static long maximumArea(long[] arr, long length) {
       long max = 0 ;
       long max_area = 0;
       long top;
       Stack <Long> stack = new Stack <Long> ();
       long i = 0;
       for(; i < length ; ){
           if(stack.empty() ||  arr[(int)(top = stack.peek())] <= arr[(int) i]){
              stack.push(i++);
           } else {
               top = stack.pop();
               max_area = arr[(int) top] * (stack.empty() ? i: i - stack.peek() - 1);
               if(max < max_area) max = max_area;
           }
       }
     while(!stack.empty()){
        top = stack.pop();
        max_area = arr[(int) top] * (stack.empty() ? i: i - stack.peek() - 1);
        if(max < max_area) max = max_area;
      }
       return max;
    }
}
