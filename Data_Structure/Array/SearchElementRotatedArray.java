package Data_Structure.Array;

public class SearchElementRotatedArray {
    public static void main(String[] args) {
        // int arr[] = {5,1,1,1,2,3,4,5};
            //    int arr[] = {2,3,4,5,1,1,1};
        int arr[] = {3,3,1,3};
        int element = 1;
        pivotSearch(arr,arr.length,element);
        for(int i =0 ;i < arr.length;i++){
                System.out.print(arr[i] + " ");
            }
       }

       public static int binarySearch(int []arr,int l,int r,int s){
           if(l<=r){
            int mid = l + (r - l)/2;
            if(arr[mid]==s) return mid;
            else if(arr[mid]>s) return binarySearch(arr,l,mid-1,s);
            return binarySearch(arr,mid+1,r,s);
           }
           return -1;
       }
       public static void pivotSearch(int[] arr, int length, int element) {
           int l = 0;
           int r = length-1;
           while(l!=r){
               int mid = l + (r - l)/2;
               if(arr[mid] == arr[r]) //if mid element same as last then move r - 1 (3,3,1,2,2,2,2,2) or (3,2,2,2,2,1,2) array min element may be left or right
                r = r - 1;
               if(arr[mid] > arr[r])
                 l = mid+1;
               else
                 r = mid;
                System.out.println("l = " + l + " , r = " + r);
           }
           System.out.println("pivot is : " + l);
           r = (length+l-1)%length;
           int index = -1;
           //apply binary search
           if(l==0)
            index = binarySearch(arr,0,length-1,element);
           else{
               index = binarySearch(arr,l,length-1,element);
               if(index == -1)
               index = binarySearch(arr,0,l-1,element);
           }

          System.out.println("index of element " +element + " is " + index);

       }
}
