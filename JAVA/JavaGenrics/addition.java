package JAVA.JavaGenrics;
abstract class Adder<T , U> {
     public 
}
public class addition {

    public static <T , U> T add(T a , U b){
          if(a instanceof String){
              a =  (a+b).toString();
          }
          a = a + b;
          return a;
    }
    public static void main(String[] args) {

    }
}
