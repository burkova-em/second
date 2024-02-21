package org.example.task2and3;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Andrei", "Gavrilov", 1,2,3,4,5,1,2,3,4,5);
        System.out.println(student);
        student.addGrade(5);
        System.out.println(student.average());
    }
}
