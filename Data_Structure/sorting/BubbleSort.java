 class BubbleSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void bubbleSort(int arr[],int n){
         boolean swapped = true;
         for(int i = n - 1 ; i >=0 && swapped ; i--){
             swapped = false;
             for(int j = 0 ; j <= i -1  ; j++){
                 if(arr[j] > arr[j+1]){
                  swap(arr,j,j+1);
                  swapped = true;
                 }
             }
             System.out.println("iteration" + (i +1));
             for(int k = 0 ;k < n ; k++){
                 System.out.print(arr[k] + " ");
             }
         }
     }
    public static void main(String[] args) {
        int arr[] = {1,4,3,4,1};
        int n = arr.length;
        bubbleSort(arr,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}
