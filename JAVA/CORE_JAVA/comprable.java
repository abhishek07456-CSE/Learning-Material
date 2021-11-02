import java.util.*;

class Person implements Comparable<Person> {
  int id;
  String name;

  Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public int compareTo(Person p1) {
    if (p1.id == this.id)
      return 0;
    else if (p1.id > this.id)
      return -1;
    return 1;
  }
}

public class comprable {
  public static void main(String[] args) {
    ArrayList<Person> student = new ArrayList<Person>();
    student.add(new Person(31, "Abhishek Chaudhary"));
    student.add(new Person(30, "Abhishek Aggarwal"));
    student.add(new Person(32, "Abhishek chug"));
    student.add(new Person(27, "Abhishek Dhiman"));
    Collections.sort(student);
    student.forEach(value -> System.out.println(value.id + " " + value.name));
  }

}
