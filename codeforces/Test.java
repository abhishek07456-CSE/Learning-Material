
import java.util.*;
import java.io.*;

class Solution {

    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            String line1[] = new String[2];
            String line2;
            int i = 1;
            while (i<=t) {
                line1 = br.readLine().split(" ");
                line2 = br.readLine();
                System.out.println("Case #" + i + ": " + getResult(Integer.parseInt(line1[0]), Integer.parseInt(line1[1]) ,line2));
                i++;
            }
        } catch (Exception e) {

        }

    }

    private static int getResult(int n, int k, String s) {
        int l = 0;
        int r = n-1;
        int count = 0;
        while(l<r){
             if(s.charAt(l)!=s.charAt(r)){
                 count++;
             }
             l++;
             r--;
        }
        if(k == count) return 0;
        else if(count > k) return count-k;
        return k - count;
    }
}