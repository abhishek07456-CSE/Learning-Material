package Data_Structure.Stack;

public class TowerOfHonoi {
    public static void main(String[] args) {
        TOH(3,'A','C','B');
    }

    private static void TOH(int n, char A, char C, char B) {
         if(n==1){
             System.out.println("MOVE DISK " +n + " FROM " + A + " TO " +C);
             return;
         }
         TOH(n-1,A,B,C);
         System.out.println("MOVE DISK " +n + " FROM " + A + " TO " +C);
         TOH(n-1,B,C,A);

    }
}
