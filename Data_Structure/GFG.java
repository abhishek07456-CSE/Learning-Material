import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int n;
        public static int search(int[] arr, int target) {
            
            int l = 0;
            int n = arr.length;
            if(n == 0)
                return -1;
            int r = n-1;
            while(l<r){
                int mid = l + (r-l)/2;
                // if(arr[mid] == target) return true;
                if (arr[mid] == arr[r]) 
			    r--;
                else if(arr[mid] > arr[r] )
                    l = mid +1;
                else
                    r = mid;
            }
           return r;
        }
        public static int fun(int a,int b){
            if(a<b)
             return fun(b,a);
            else if(b!=0){
                return (a+fun(a,b-1));
            }
            return 0;
        }
	public static void main (String[] args)
	 {
    //    int n = 127;
    //    int i=0,r,p,s =0;
    //    while(n>0){
    //         r= n%10;
    //         p=8^i;
    //         s=s+p*r;
    //         i++;
    //    n=n/10;
    //  }
     System.out.println(fun(8,9));
    }
}