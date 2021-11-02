import java.util.Scanner;

public class move_new_office {
    public int x;
    public int y;
    public int arr[];
    public int brr[];
    public int n;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        move_new_office obj = new move_new_office();
        while(t--!=0){
            obj.x = read.nextInt();
            obj.y = read.nextInt();
            int n = read.nextInt();
            obj.arr = new int[n];
            obj.brr = new int[n];
            for(int i=0;i<n;i++){
             obj.arr[i]  = read.nextInt();
            }
            System.out.println(obj.cost_move_office(0, n));
        }
    }

    public int cost_move_office(int s , int e) {
          int mid = (e-s)/2;
          if(mid <= 0 ||  brr[s+mid] == 1)
          return 0;
          int k = (this.x*(this.arr[s+mid] - this.arr[s]) + this.y*(this.arr[e-1]-this.arr[s+mid]));
          this.brr[s+mid] = 1;
          if(mid == 1)
          return k;
          return k + this.cost_move_office(s,mid+1) +  this.cost_move_office(mid,e);
        }
    }
