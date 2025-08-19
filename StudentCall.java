public class StudentCall {
public static void main(String[] args) {

    Student[] student={
    new Student("Pemba", 101, 112, 3),
    new Student("Ram", 103, 112, 3),
    new Student("Shyam", 101, 112, 3),
    new Student("Hari", 101, 112, 3),
    new Student("Sita", 101, 112, 3),
    };

    for(int i = 0; i<student.length;i++){
        student[i].print();
    }

}
}
