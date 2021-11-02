public class SelectionSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void selectionSort(int arr[],int n){
          for(int i=0;i<n-1;i++){
                int min = i;
                 for(int j = i+1;j<n;j++){
                     if(arr[j] < arr[min])
                       min = j;
                 }
                if(min != i)
                swap(arr,i,min);
          }
     }

     static public void stableSelectionSort(int arr[],int n){
       // 4(a) 3 2 4(b) 1 = > after first min find is 1 => 1 3 2 4(b) 4(a) relative order lost
       for(int i = 0 ;i < n-1 ; i++){
          int min = i;
          for(int j = i + 1; j < n ;j++){
               if(arr[j] < arr[min]){
                 min = j;
               }
          }
          int key = arr[min];
          while(i<min){
              arr[min] = arr[min-1];
              min--;
          }


          arr[i] = key;
          for(int j =0 ;j < n;j++){
            System.out.print(arr[j] + " ");
          }
          System.out.print("\n");

       }
   }
    public static void main(String[] args) {
        int arr[] = {4,3,2,4,1};
        int n = arr.length;
        stableSelectionSort(arr,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));

    }
}
