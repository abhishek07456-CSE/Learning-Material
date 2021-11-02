public class binarySearch_loop {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        int l=0;
        int r=3;
        int s =-1;
        int position =-1;
        while(true){
            if(l>r) break;
            int mid = l +(r-l)/2;
            if(arr[mid] == s) { position = mid+1; break; }
            else if(arr[mid] > s) {r=mid-1;}
            else {l=mid+1;}
        }
        if(position == -1)
        System.out.println("Not found");
        else{
            System.out.println("found at "+position);
         }
    }
}
