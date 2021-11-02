public class check_rotated_array_is_sorted {
         public static void main(String[] args) {
             int arr[] = {5,6,7,1,2,3,4};
             int len = arr.length;
             int l = 0;
             int r = len-1;
             while(l<r){
                 int mid = l+(r-l)/2;
                 if(arr[mid]>arr[r])
                  l =  mid + 1;
                else
                  r = mid;
             }
             for(int i = r; i < len; i++){
                
             }
             System.out.println(r);
         }
}
