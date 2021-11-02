public class foreachloop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        for(int e : a){
             a[e-1] =5;
            System.out.println(e);
        }
    }
}
