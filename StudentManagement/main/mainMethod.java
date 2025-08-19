package StudentManagement.main;
import StudentManagement.university.Student;

public class mainMethod {
    public static void main(String[] args) {
        Student std = new Student(101, "BCA");
        std.studentDetails();
    }
}