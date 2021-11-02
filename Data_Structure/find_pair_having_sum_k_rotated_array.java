public class find_pair_having_sum_k_rotated_array {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int l = 0;
        int n = arr.length;
        int r = n-1;
        // 5 6 1 2 2 4
        // 4 5 0 1 2 3
        // 2 3 4 5 1
        int found = -1;
        int e = 16;
        while(l<r){
            int mid = l + (r - l)/2;
            if(arr[mid] > arr[r])
             l = mid +1;
            else
             r= mid;
        }
        if(l>0)
        r = l-1;
        else
        r = n-1;
        while(l!=r){
            if( l==r)
            break;
            int sum = arr[l] + arr[r];
            if(sum == e){
               found = 1;
                break;
            } else if(sum > e)
              r= (n+r-1)%n;
             else 
              l = (l+1)%n;

        }

        if(found == -1)
        System.out.println(false);
        else
        System.out.println(true);

       
    }
}
