package Data_Structure.Array;

public class JugglingArrayRotation {
   public static int gcd(int a ,int b){ // 6 , 2
       if(b==0) return a;
       return gcd(b,a%b);
   }
   public static void jugglingArrayRotation(int arr[],int n,int k){
      k = k%n;
      int gcd = gcd(k,n);
      for(int i = 0;i<gcd;i++){
          int value = arr[i];
          int key = i;
          int curr_index = i;
          while(true){
              curr_index = key + k;
              if(curr_index >= n)
               curr_index = curr_index - n;
              if(curr_index == i) break;
              arr[key] = arr[curr_index];
              key = curr_index;
          }
          arr[key] = value;
      }
   }
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int k = 2;
    jugglingArrayRotation(arr,arr.length,k);
    for(int i =0 ;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
   }
}
