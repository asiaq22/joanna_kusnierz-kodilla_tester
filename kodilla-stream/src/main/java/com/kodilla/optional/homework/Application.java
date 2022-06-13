package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Williams", new Teacher("Victor Smith")));
        students.add(new Student("George Thomas", new Teacher("William Brown")));
        students.add(new Student("Robert Walker", null));
        students.add(new Student("David Roberts", new Teacher("William Brown")));
        students.add(new Student("Monica White", new Teacher("Mark Patterson")));
        students.add(new Student("Alicia Green", null));
        students.add(new Student("Caroline Wood", null));
        students.add(new Student("Emma Edwards", new Teacher("Patrick Jones")));
        students.add(new Student("Olivia Lewis", new Teacher("Peter Evans")));


        for (Student student : students) {

            Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>"));

            System.out.println("Student: " + student.getName() + ", teacher: " + teacher.getName());
        }
    }
}
