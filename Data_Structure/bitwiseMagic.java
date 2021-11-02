public class bitwiseMagic {
    static public void set_nth_bit(int n,int p){
        p--;
        System.out.println(n|(1<<p));
    }
    static  public void unset_nt_bit(int n,int p){
        p--;
        System.out.print(n&(~(1<<p)));
    }
    static public void toggling_bit(int n,int p){
        p--;
        System.out.print(n^(1<<p));

    }
    public static void main(String[] args) {
        // set_nth_bit(8,3);
        // unset_nt_bit(8,4);
        toggling_bit(8,2);
    }
    
}
