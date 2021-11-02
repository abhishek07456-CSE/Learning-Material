public class object_def {
    public int a =1;
    public int b =1;
    public static int c=1;
    public object_def(){
        a++;
        b++;
        c++;
    }
    public static void main(String[] args) {
        object_def obj = new object_def();
        obj.a = 1;
        object_def.c = 1;
        object_def obj1 =   new object_def();
        System.out.println(obj1.a);
        System.out.println(obj1.a);

    }
}
