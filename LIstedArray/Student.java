package LIstedArray;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    String name;
    int id;
    String course;

    Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void printDetails(){
        System.out.println("Name: "+name+", id: "+id+", Course: "+course);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && name.equals(student.name) && course.equals(student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, course);
    }

    }

