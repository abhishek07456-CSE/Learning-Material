import java.util.*;

class Student{
  int id;
  int marks;
  String name;
  Student(int id, String name , int marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
  }
}


public class compartor {
  public static void main(String[] args) {
    ArrayList<Student> student = new ArrayList<Student>();
    student.add(new Student(31, "Abhishek Chaudhary" ,100));
    student.add(new Student(30, "Abhishek Aggarwal" , 98));
    student.add(new Student(32, "Abhishek chug",98));
    student.add(new Student(27, "Abhishek Dhiman",99));
    Collections.sort(student ,new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
          if(o1.marks == o2.marks){
            if(o1.id > o1.id) return -1;
            return 1;
          }else if(o1.marks > o2.marks) return -1;
           return 1;
      }
    });
    student.forEach(value -> System.out.println(value.id + " " + value.name + " " + value.marks));
  }

}
