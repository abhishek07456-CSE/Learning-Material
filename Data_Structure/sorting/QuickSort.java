public class QuickSort {
    static public void swap(int arr[] , int i , int j){
         int t = arr[i];
         arr[i] = arr[j];
         arr[j] = t;
    }
     static int choose_last_element_partition(int arr[],int l ,int r){
        int j = l - 1 ;
        for(int i = l  ; i  < r;i++){
            if(arr[i] < arr[r]){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j+1,r);
       return j+1;
     }

     static int choose_first_element_partition(int arr[],int low ,int high){
        //4 3 2 6 1 5
        int pivot = arr[low];
        int left = low+1;
        int right = high;
        System.out.println("pivot = " + pivot);
        while(left <= right){
            while(arr[left]<pivot && left < high){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if(left<right){
                swap(arr,left,right);
                left++;
                right--;
            } else
              left++;
        }
        arr[low]=arr[right];
        arr[right] = pivot;
        return right;

    }
     static public void quickSort(int arr[],int l ,int r){
        if(l<r){
            int p = choose_first_element_partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);

        }
     }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        int n = arr.length;
        quickSort(arr,0,n-1);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}
