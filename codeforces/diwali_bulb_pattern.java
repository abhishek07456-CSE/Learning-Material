import java.util.Scanner;

 class diwali_bulb_pattern {
    public static Scanner scanner = new Scanner(System.in);
    public static long all_occ(){
        long count = 1;
        String s = scanner.next();
        long l = s.length();
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        if(x == y)
        return s.charAt((int) (x-1)) == 'B' ? 1 : 0;
        long arr[] = new long[(int) l];
        arr[0] = s.charAt(0) == 'B' ? 1 : 0;
        while(count < l){
          arr[(int) count] = arr[(int) (count - 1)] + (s.charAt((int) count) == 'B' ? 1 : 0);
          if(count == y-1)
          break;
          count++;
        }
        long px =x;
        long py =y;
        long result = 0;
        py = py%l == 0 ? l-1 : py%l-1;
        px = px%l == 0 ? l-1 : px%l-1;
        py = py == 0 ? arr[0] : arr[(int) py]-arr[(int) (py-1)];
        px = px == 0 ? arr[0] : arr[(int) px]-arr[(int) (px-1)];
        result = (y-x+1)/l*arr[(int) (l-1)];
        if(result == 0)
        result = px + py;
        else
        result += ((x==1)?0:px)+ ((y==1-1)?0:py); 
        return result;

    }
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t--!=0){
          System.out.println(diwali_bulb_pattern.all_occ());
        }
    }
}
