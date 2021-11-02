package Data_Structure.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {5,4,2,8,3,4,0};
        int find = 13;
        // find3Numbers(arr,arr.length,find);
        find3Index(arr,arr.length,find);

    }

    public static void find3Numbers(int[] arr, int n, int e) {
        // if same index not want only element due to sorting index lost
        Arrays.sort(arr);
        for(int i = 0 ;i < (n-2);i++){
           int l = i + 1;
           int r = n - 1;
           while(l<r){
               int sum  = arr[i]+arr[l]+arr[r];
               if(sum==e){
                   System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
                   break;
               } else if (sum > e) r--;
                else l++;
           }
        }
    }

    public static void find3Index(int[] arr, int n, int e) {
        // hashing used to retain index and all 3 pair list having sum e
        Map <Integer , Integer> m = new HashMap<>();
        for(int i = 0 ;i < (n-2);i++){
           int left_sum = e - arr[i];
           m.clear();
           for(int j = i + 1 ; j < n  ; j++){
               Integer key = m.get(left_sum - arr[j]);
               if(key!= null){
                   System.out.println("index - " + i + " " + j + " " + key.intValue());
               }
               m.put(arr[j],j);
           }

        }
    }
}
