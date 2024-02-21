package org.example.task2and3;

public class SSTest {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Oleg", "Myagkov", new int[]{1, 5, 2, 2, 3, 4, 5});
        students[1] = new Student("Masha", "Borisova", new int[]{1, 2, 3, 2, 3});
        students[2] = new Student("Pasha", "Kolesov", new int[]{5, 4, 5, 4, 5, 5});
        students[3] = new Student("Danil", "Kruglov", new int[]{4, 2, 3, 5, 4});
        students[4] = new Student("Marina", "Serova", new int[]{5, 5, 5, 5, 2, 5});

        StudentService studentService = new StudentService(students);
        System.out.println(studentService.bestStudent(students));
        studentService.sortBySurname(students);
    }
}
