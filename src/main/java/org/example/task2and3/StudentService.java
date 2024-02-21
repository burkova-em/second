package org.example.task2and3;

import java.util.*;
import java.util.stream.DoubleStream;

public class StudentService {

  public Student[] students;

  public StudentService(Student[] students) {
    this.students = students;
  }

  public double bestStudent(Student[] students){

    return  Arrays.stream(students).flatMapToDouble(s -> DoubleStream.of(s.average())).max().orElse(0.0);
  }


  public void sortBySurname(Student[] students){

   Arrays.sort(students, Comparator.comparing(Student::getSurname));
      for (Student student : students) {
          System.out.println(student.getSurname());
      }
  }
}
