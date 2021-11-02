import java.util.Scanner;

/*
  You are given a string which is the hint of a password. Given string only consist of character '1' to '9' and '-'.

You can replace '-' by any digit from '1' to '9'.

Find the number of ways to make a password by replacing all '-' characters to some digit, such that the digits of the password are in non-decreasing order.

5
5
1---2
3
3-4
7
2--43-4
8
1---23-4
1
-

output
4
2
0
8
9
*/
public class password_0to9_replacingdash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int min = 1;
            int r = sc.nextInt();
            String s = sc.next();
            int l = 0;
            int e = 0;
            int result = 0;
            while(l<r){

                if(s.charAt(l)!='-'){
                    if((s.charAt(l)-48) < min){
                        e = 0;
                        result = 0;
                        break;
                    }
                   if(e>0){
                     result = result + e*((s.charAt(l)-48) - min + 1);
                   }
                   e = 0;
                   min = s.charAt(l)-48;
                }
                else
                 e++;
                 l++;
            }
            if(e>0){
                result = result + e*(9- min+1);
            }
            System.out.println(result);


        }
    }
}

