import java.util.Scanner;

public class appartment_floor {
    public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);
        int t = read.nextInt();
        int n,x,i;
        int l,r;
        while(t!=0){
          n= read.nextInt();
          x= read.nextInt();
          l=3;
          i=1;
          while(l<=n){
            r= l+x-1;
            l= r+1;
            i++;
          }
          System.out.println(i);
          t--;
      }
    }
}
