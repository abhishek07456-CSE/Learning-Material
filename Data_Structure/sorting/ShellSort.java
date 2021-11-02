public class ShellSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void shellSort(int arr[],int n){
         int gap = n;
            while(gap>0){
                for(int i = gap ; i < n ;i++){
                    int t = arr[i];
                    int j = i - gap;
                    while(j>=0 && t < arr[j]){
                        arr[j+gap] = arr[j];
                        j-=gap;
                    }
                    arr[j+gap] = t;
                }
                gap/=2;
            }
     }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,7,9,11,22,34,67,98,24,56};
        int n = arr.length;
        shellSort(arr,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}
