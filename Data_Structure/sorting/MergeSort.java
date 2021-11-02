public class MergeSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void mergeSort(int arr[],int l , int r){
         if(l<r){
             int mid = l + (r - l)/2;
             System.out.println("(" + l + " to " + mid + ")  , (" + (mid+1) + " to " + r + ")");

             mergeSort(arr,l,mid);
             mergeSort(arr,mid+1,r);
             merge(arr,l,mid,r);

         }
     }

     static public void merge(int[] arr, int l, int mid, int r) {
         // 1 2 3 4 5 6 7 8
         int left = mid - l + 1;//1 to 1
         int right = r - mid;//1 to 2
         int arr1[] = new int[left];
         int arr2[] = new int[right];
         for(int i = 0;i<left;i++)
          arr1[i] = arr[l+i];
         for(int i = 0;i<right;i++)
          arr2[i] = arr[mid+i+1];
         int i = 0;
         int j = 0;
         int k = l;
         while(i<left && j<right){
            if(arr1[i] > arr2[j]){
                arr[k++] = arr2[j++];
            }else{
                arr[k++] = arr1[i++];
            }
         }
         while(i<left){
                arr[k++] = arr1[i++];
         }
         while(j<right){
                arr[k++] = arr2[j++];
         }
     }

     public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}
