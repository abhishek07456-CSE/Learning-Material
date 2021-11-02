package JAVA;

import java.util.*;

//[4, 3, 6, 2, 1, 1]
class Inv {
    public static void main(String[] args) {
        int a[] ={2,3,3,4};
        int b[] ={1,1,0,0};
        System.out.println(func(a , b));
    }

    public static int func(int A[] , int B[]){
         HashMap<Integer, Integer> map = new HashMap<>();
         int l = A.length;
         for(int i = 0 ; i < l; i++){
                int p1 = findP(A[i], map);
                int p2 = findP(B[i], map);
                if(p1 != p2) {
                    map.put(p1 , p2);
                }
         }
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0 ; i <= l; i++) {
            int temp = findP(i, map);
            ans.put(temp ,  ans.getOrDefault(temp, 0) + 1);
        }
        System.out.println(ans);
        System.out.println(map);

        for(int i = 0 ; i <= l ; i++) {
            if(map.get(i) != null && ans.get(i) != null && ans.get(i) == l + 1) return i;
        }
        return -1;
    }
    public static int findP(int num ,  HashMap<Integer, Integer> map){
        if(map.get(num)== null || map.get(num) == num){
            // map.put(num , num);
            return num;
        }
        return findP(map.get(num), map);
    }


}