package StudentManagement.university;
import StudentManagement.people.Person;

// * It should have a student ID and course name.
// * It should print student details, including name, age, and course.

public class Student extends Person {
    int studentId;
    String course;

    public Student(int studentId, String course){
        super("pemba", 21, 0);
        this.studentId = studentId;
        this.course = course;
    }

    public void studentDetails(){
        System.out.println("Student ID: "+ studentId);
        System.out.println("Course: "+ course);
        PersonalData();
    }
}
