public class CountingSort {
    static public void swap(int arr[] , int i , int j){
         int t = arr[i];
         arr[i] = arr[j];
         arr[j] = t;
    }
     static public void countingSort(int arr[],int l ,int r){
       int counter[] = new int[6];
       for(int i = 0 ;i < r ;i++){
           counter[arr[i]]++;
       }
       int i = 0;
       int count = 0;
       while(i<r){
           if(counter[count]==0) count++;
           else{
           arr[i] = count;
           counter[count]--;
           i++;
           }
       }
     }
     public static void stableCountingSort(int arr[] ,int  l, int n){
         if(n==0) return;
         int output[] = new int[n];
         int max = arr[0];
         int min = arr[0];
         for(int i = 1; i < n ;i++){
             if(arr[i] > max) max = arr[i];
             if(arr[i] < min) min = arr[i];
         }
         int range = max - min  + 1; // for -ve element also
         int counter[] = new int[range];
         for(int i = 0 ;i < n ;i++) counter[arr[i] - min]++;
         for(int i = 1 ;i < range ; i++) counter[i] += counter[i-1]; //store last position of each element
         //inserting according to relative order for stablelity
         for(int i = n-1 ;i >=0 ; i--){
             output[counter[arr[i]-min] - 1] = arr[i]; //get element psoition from last
             counter[arr[i]-min]--; //decrese by 1 so next previous element get it correct position
         }
         for(int i = n- 1 ;i >=0 ; i--){
            arr[i] = output[i];
        }

     }
    public static void main(String[] args) {
        int arr[] = {-1 , 0 ,-1,1};
        int n = arr.length;
        stableCountingSort(arr,0,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}
