public class find_max_element_rotated_Sorted_arr {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int l =0;
        int n = arr.length;
        int r = n -1;
        // 4 5 6 7 8 1 2 3
        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid] > arr[r])
             l = mid+1;
            else
             r = mid;
        }
        System.out.println("min element " + arr[l]);
        if(l>0)
        System.out.println("max element " + arr[l-1]);
        else
        System.out.println(arr[n-1]);

    }
}
