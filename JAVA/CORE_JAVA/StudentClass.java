public class StudentClass implements Cloneable {
    public static int school_id = 1;
    public static String school_name = "cithara university";
    public String student_name;
    public int student_id;
    public String student_stream;

     static {
        System.out.println(school_name + " " + school_id);
    }
    public StudentClass(){
        System.out.println("constructor initialized");

    }
    public StudentClass(int student_id, String student_name, String student_stream) {
        this();
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_stream = student_stream;
    }

    public String toString() {
        return "id = " + this.student_id + "\n" + "Name = " + this.student_name + "\n" + "Stream = "
                + this.student_stream;
    }
    public Object clone()throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StudentClass s1 = new StudentClass(1031, "AbhisheK", "CSE");
        StudentClass s2 = new StudentClass(1031, "AbhisheK", "CSE");
        StudentClass s31 = s1;
    
      StudentClass s32 = (StudentClass) s2.clone();
       

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s31.hashCode());
        System.out.println(s32.hashCode());

        // System.out.println(s32.hashCode());

    }
}
