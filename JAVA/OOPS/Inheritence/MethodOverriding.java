package JAVA.OOPS.Inheritence;

public class MethodOverriding {
  public static void main(String[] args) {
      child c = new child();
      c.method();
  }
}

class Parent{
    public static int b = 1;
    Parent(){
        System.out.println("parent cosn called");
    }
    Parent(String a){
        System.out.println("parent param called");

    }
    {
        System.out.println("COMMON CODE called");

    }
    Object method(){ ///covarient return type with for method overiding
        System.out.println("Parent Method called");
        return null;
    }
}
class child extends Parent{
    public static int a = 2;
    child(){
        // super("hello");
        System.out.println("child cosn called");
    }
    String method(){
        System.out.println("child Method called" + b);
        return "HELLO";
    }
}