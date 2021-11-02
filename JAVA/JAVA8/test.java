package JAVA.JAVA8;

import java.util.*;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

class Person{
    public String name;
    public int id;
    Person(int id , String name){
        this.name =name;
        this.id = id;
    }
    public String toString(){
        return this.id+" "+this.name;
    }
}
public class test {
    public static void main(String[] args) {
    //     ArrayList <Person> list = new ArrayList <Person>();
    //     list.add(new Person(3,"sahile"));
    //     list.add(new Person(31 ,"Abhishek"));
    //     list.add(new Person(31 ,"aaayush"));
    //     list.add(new Person(2,"aayush"));

    //    Collections.sort(list , (Person p1, Person p2) -> {
    //        if(p1.id != p2.id)
    //        return p1.id >= p2.id ? 1: -1;
    //        return p2.name.compareTo(p1.name);
    //    });

       HashMap <Integer , String> map = new HashMap <Integer , String> ();
       map.put(31,"Abhishek");
       map.put(30,"aayush");
       map.put(31,"AAbhishek");
       map.put(2,"aayush");

        map
       .entrySet()
       .stream()
       .sorted(Map.Entry.<Integer, String>comparingByValue()
       .thenComparing(Map.Entry.comparingByKey()))
       .collect(
           toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2));
        System.out.println(map);
    }

}
