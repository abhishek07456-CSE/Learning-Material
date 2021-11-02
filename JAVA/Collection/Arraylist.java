package JAVA.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList  <Integer> list = new ArrayList <Integer> ();
        list.add(1);
        Collections.addAll(list, 5 ,4,5,6,7,8);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(5));
        System.out.println(list.remove(5));//index
        System.out.println(list.removeIf(n->n%2==0));

        System.out.println(list);

    }
}
