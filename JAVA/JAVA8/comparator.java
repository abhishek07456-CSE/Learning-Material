package JAVA.JAVA8;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class comparator {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer> ();
        list.add(31);
        list.add(34);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list , (Integer p1 , Integer p2) -> p2.compareTo(p1));
        System.out.println(list);
        list.forEach(value -> System.out.println(value));

    }
}
