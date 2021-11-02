

/*
Steve has k dollars and he wants to buy some items from a shop. This shop has n elements arranged in a row. For a given i(1≤i≤n), the rate of the ith item is ai.

The shop has a weird rule. A customer can only buy the items that form a contiguous segment, that is, they will choose two integers l and r (1≤l≤r≤n) and buy all the items in the subsegment [l,r].

A subsegment [l,r](l≤r) of array a is the sequence al,al+1,…,ar.

Today the shop has a special offer. If a customer buys an item of some rate, then all other items in the selected range with the same rate can be bought for free.

Find the maximum number of items that Steve can buy with k dollars by visiting the shop only once.

input
3
8 5
1 3 2 2 2 3 1 3
8 6
1 1 2 2 2 3 3 3
5 5
1 1 2 3 3
output
5
8
3

*/
import java.util.*;
public class offer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        Map <Integer , Integer> m = new LinkedHashMap <Integer , Integer> ();
        while(t--!=0){
            int n = 13;
            int max = 0;
            int arr[] ={1,3,2,2,2,3,1,2,2,2,2,2,2};
            int k =  5;
            // for(int i = 0;i<n;i++){
            //     arr[i] = sc.nextInt();
            // }
            int till_max = 0;
            int start = 0;
            int money = 0;
            for(int i = 0 ;i<n;i++){
                if(m.get(arr[i]) == null){
                    m.put(arr[i],1);
                    int temp = money+arr[i];
                    // System.out.println("ml "+temp);
                    while(start < i && temp > k){
                        money-=m.get(arr[start])*arr[start];
                        till_max-=m.get(arr[start]);
                        temp-=m.get(arr[start])*arr[start];
                        m.remove(arr[start]);
                        start++;

                    }
                    int j = i -1;
                    while(j>=0){
                        int temp2 = temp + arr[j];
                        if(temp2<=k){
                            m.put(arr[j],1);
                            
                        }
                       j--;
                    }

                    if(temp<=k){
                        money=temp;
                        till_max++;
                    }
               }else{
                    m.put(arr[i],m.get(arr[i])+1);
                    till_max++;
                }
                System.out.println(till_max +" "+money);
                if(max<till_max)
                 max = till_max;
            }
            System.out.println(max);
        }
    }
}
