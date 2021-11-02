public class objectDefine {
    public int a = 1;
    public objectDefine(){
        // b =3;
        System.out.print("constructor called block called"); // when compiled
    }
    static {
        b =1;
        System.out.print("static block called"); // when compiled
    }
    public static int b =2;

    public static void main(String[] args) {
        objectDefine obj = new objectDefine();
        System.out.println(obj.toString());
    }
}
