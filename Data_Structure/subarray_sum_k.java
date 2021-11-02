public class subarray_sum_k {
    public static int subarraysDivByK(int[] arr, int K) {
        
        int left = 0;
        int right = 0;
        int count = 0;
        int bound = arr.length;
        if(bound == 0)
          return 0;
        int cur_sum = 0;
        while(true){
            if(left>=bound && right>=bound)
                break;
            else if(right>=bound && cur_sum < K)
                break;
          
            if(cur_sum < K && right < bound){
                cur_sum += arr[right];
                count += cur_sum == K ? 1 : 0;
                right++;
            }
            else{
                cur_sum -= arr[left];
                count += cur_sum == K ? 1 : 0;
                left++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10 ,2, -2 ,-20, 10};
        System.out.println(subarraysDivByK(arr,10));
    }
}
