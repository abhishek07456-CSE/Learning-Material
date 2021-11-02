package JAVA.JavaGenrics;
import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
         ArrayList list = new ArrayList();
         list.add(1);
         list.add("ahishek");//no type safety
         System.out.println(list);

         ArrayList <Integer> list1 = new ArrayList <Integer>  ();
         list1.add(1);
        // list.add("ahishek");//type safty and throw runtime error
         System.out.println(list);
    }
}
