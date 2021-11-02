package JAVA.JAVA8;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student{
    public int id;
    public String name;
    public int marks;
    public String location;
    Student(int id, String name , int marks,String location){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.location = location;
    }
    @Override
    public String toString(){
        return id+ " "+name+" "+marks+" "+location;
    }
    public String getName(){
      return this.name;
    }
    public int getMarks(){
        return this.marks;
    }
    public int getIds(){
        return this.id;
    }
}
public class stream {
    public static <T> void printList(List <T> list){
       list.forEach(value -> System.out.println(value));
       System.out.println();
    }
    public static void main(String[] args) {
        List <Student> list = new ArrayList <Student> ();
        list.add(new Student(1610091032, "Abhishek Chaudhary" , 99 , "Himachal"));
        list.add(new Student(1610091031, "Abhishek Chaudhary" , 99 , "Himachal"));
        list.add(new Student(1610091030, "Abhishek Aggarwal" , 91 , "Delhi"));
        list.add(new Student(1610091027, "Abhishek Dhiman" , 96 , "Haryana"));
        list.add(new Student(1610091032, "Abhishek Chug" , 70 , "Chandigarh"));
        list.add(new Student(1610091033, "Ak" , 70 , "Himachal"));
        Collections.sort(list , Comparator.comparing(Student::getName).thenComparing(Student::getIds));
        System.out.println(list);

        System.out.println("Intitial List");
        printList(list);

        System.out.println("list of student having marks greter then 95");
        List <Student> listAbove95 = list.stream().filter(value -> value.marks > 95).collect(Collectors.toList());
        printList(listAbove95);

        System.out.println("count of student having marks greter then 95");
        long count = list.parallelStream().filter(value -> value.marks > 95).count();
        System.out.println(count);

        System.out.println("student name only having city himacahl");
        String studentHim = list.parallelStream().filter(value -> value.location.equals("Himachal")).map(value -> value.name).collect(Collectors.joining("|"));
        System.out.println(studentHim);

        System.out.println("student id having marks greter then 85 and from himachal");
        List <Integer> studentHim_95 = list.parallelStream().filter(value -> value.marks > 85 && value.location.equals("Himachal")).map(value -> value.id).collect(Collectors.toList());
        System.out.println(studentHim_95);


        System.out.println("get unique value from array");
        List <Integer> unique = Arrays.asList(1,2,2,4,5,2,6,8).stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        System.out.println(unique);
        Arrays.asList(1,2,2,4,5,2,6,8).stream().distinct().forEach(System.out::print);


        System.out.println("get student id having maz marks");
        int max_marks_id = list.stream().max((s1 , s2) ->(s1.marks > s2.marks ? s1.marks : s2.marks)).get().id;
        System.out.println(max_marks_id);

        System.out.println("get unique id list");
        Map<Integer, List<Student>> uniqueId= list.stream().collect(Collectors.groupingBy(value -> value.id));
        System.out.println(uniqueId);

        System.out.println("get unique id and name pair");
        Map<Integer, String> uniqueId1= list.stream().collect(Collectors.toMap(value-> value.id, value -> value.name , (existingValue, newValue) -> newValue));
        System.out.println(uniqueId1);
    }

}
