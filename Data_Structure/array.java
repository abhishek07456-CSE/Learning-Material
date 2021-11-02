import java.util.Scanner;

public class array{
    static int arr[];
    static int size;
    static int current_size;
    public static void print_array(){
       for(int i=0;i<size;i++){
           System.out.print(arr[i] +  " ");
       }
       System.out.print("\n");
    }
    public static void fill_array(){
        for(int i=0;i<size;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        size = s.nextInt();
        current_size = size;
        arr = new int[size];
        fill_array();
        print_array();
        int choices;
        int e,p,k;
        while(true){
            System.out.println("1. Insert Element : \n 2. Delete Element \n 3. Exits");
            choices = s.nextInt();
            switch(choices){
                case 1 :
                System.out.println("Enter Element");
                e = s.nextInt();
                System.out.println("Enter Position");
                p = s.nextInt();
                if(p>size || p<0)
                System.out.println("Position must be less Then Size or greater then equal to zero");
                else if(current_size == 0)
                System.out.println("No More Space To left");
                else{
                        int left = p-1;
                        int right = p-1;
                        p--;
                        while(true){
                            if(left==-1 && right ==size)
                            break;
                            else if(left < 0)
                            left = 0;
                            else if(right >= size)
                            right = size-1;
                            if(arr[left] == Integer.MIN_VALUE){
                                k = p-left;
                                System.out.println(k+" shift required from left");
                                for(int i=left;i<p;i++){
                                   arr[i] = arr[i+1];
                                }
                                arr[p] = e;
                                break;
                            }
                            if(arr[right] == Integer.MIN_VALUE){
                                k = right-p;
                                System.out.println(k+" shift required from right");
                                for(int i=right;i>p;i--)
                                  arr[i] = arr[i-1];
                                  arr[p] = e;
                                break;
                            }
                            left--;
                            right++;
                      }
                }
                print_array();
                current_size--;
                break;

                case 2:
                System.out.println("Enter Position to be delete");
                p = s.nextInt();
                if(p>size || p<0)
                System.out.println("Position must be less Then Size or greater then equal to zero");
                else{
                arr[p-1] = Integer.MIN_VALUE;
                current_size++;
                print_array();
                }

                break;
                case 3:
                return;

            }

        }

    }
}