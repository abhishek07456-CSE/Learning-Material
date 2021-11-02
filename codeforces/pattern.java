import java.util.Scanner;

 class Solution {
    public static long all_occ(String s,long st, long l){
        long count = 0;
        l--;
         while(true){
           if(st > l){
             break;
           } else if(st == l) {
              count += s.charAt((int)st) == 'B' ? 1 :0;
              break;
           }else {
            count += s.charAt((int)st) == 'B' ? 1 :0;
            count += s.charAt((int)l) == 'B' ? 1 :0;
           }
           st++;
           l--;
         }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long temp;
        int i = 1;
        while(t--!=0){
          String n = s.next();
          long x = s.nextLong();
          long y = s.nextLong();
          long l = n.length();
          long total = 0;
          while(true){
            if(x>y)
            break;
            else if(x%l == 1  && (y-x+1) >= l){
                 temp = (y/l)*l;
                 total+= ((temp-x+1)/l) * all_occ(n,0,l);
                 x=temp+1;
            } else {
                total+= n.charAt((int)((x-1)%l))=='B'?1:0;
                x++;
            }
          }
           System.out.println("Case #"+i+": "+total);
           i++;
        }
    }
}
