package Data_Structure.Stack;

import java.util.Stack;

public class stockSpan {

    public static int[] calculateSpan(int price[], int n)
    {
        int arr[] = new int[n];
        arr[0] = 1;
        // for(int i =1 ; i< n;i++){
        //     arr[i] = 1;
        //     for(int j = i-1 ; j>=0 && price[i] >= price[j] ; j--)
        //     arr[i]++;
        // }
        Stack <Integer> s = new Stack<Integer>();
        s.push(0);
        for(int i = 1 ; i< n;i++){
             while(!s.empty() && price[s.peek()] <= price[i]){ // remove all until maximum index element at top
                 s.pop();
             }
             arr[i] = s.empty() ? (i+1) : (i - s.peek()); //if empty then this index element is maximum from all previous otherwise gap between current element to last previous
             s.push(i);
        }

        return arr;
    }
    public static void main(String[] args) {
    //   int arr[] = {3,2,1}; // 1 1 1
      int arr[] = {3,2,4,3,5};

      arr = calculateSpan(arr,arr.length);
      for(int i  = 0 ; i  < arr.length ; i++)
       System.out.print(arr[i]+" ");
    }
}
