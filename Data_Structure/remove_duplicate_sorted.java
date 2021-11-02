public class remove_duplicate_sorted {
    public static void main(String[] args) {
        int arr[] = {-1,-1,-1,0,0,0,0,0,1,2,2,2,2,2,2,4,4,4,5};
        int n = arr.length;
        int j = 0;
        int dup = 0;
        while(j<n){
              int current = j;
              while(j+1<n && arr[j] == arr[j+1]){
                  j++;
              }
              dup=j-current;
              int mv = current +1;
              if(dup>0){
                for(int i = j+1;i<n;i++){
                    arr[mv++] = arr[i];
                }
              }
              j=current+1;
              n-=dup;
        }
        for(int i=0;i<n;i++)
         System.out.println(arr[i]);

    }
}
