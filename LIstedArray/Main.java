package LIstedArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    Scanner x;
        public static void main(String[] args) {
        ArrayList<String> studentDetails= new ArrayList<>();
        studentDetails.add(new Student("pemba",121,"BCA"));
        studentDetails.add(new Student("pemba",121,"BCA"));
        studentDetails.add(new Student("pemba",121,"BCA"));
        studentDetails.add(new Student("pemba",121,"BCA"));

        for(Student student: studentDetails){
            student.printDetails();
        }
    }
}
