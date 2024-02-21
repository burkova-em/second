package org.example.task2and3;

import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int[] grades;

    public Student(String name, String surname, int... grades) {
        this.name = name;
        this.surname = surname;
        this.grades = grades;
    }

    public Student() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return this.grades;
    }

    public void setGrades(int... grades) {
        fillGrades(grades);
    }

    public boolean arrayCheck() {
        return getGrades().length <= 10 && getGrades().length > 1;
    }

    private void fillGrades(int[] grades) {
        this.grades = new int[10];
        if (grades.length == this.grades.length) {
            this.grades = grades;
        } else if (grades.length < this.grades.length) {
            System.arraycopy(grades, 0, this.grades, 10 - grades.length, grades.length);
        } else {
            System.arraycopy(grades, grades.length - 10, this.grades, 0, this.grades.length);
        }
    }

    public void addGrade(int grade) {
        if (arrayCheck()) {
            int[] newGrades = Arrays.copyOfRange(getGrades(), 1, getGrades().length + 1);
            newGrades[getGrades().length - 1] = grade;
            this.grades = newGrades;
            System.out.println(Arrays.toString(newGrades));
        } else {
            System.out.println("Оценок больше чем 10 или меньше 1, извините");
        }
    }

    public double average() {
        double a = 0.0;
        if (arrayCheck()) {
            for (int grade : getGrades()) {
                a += grade;
            }
            System.out.println(a);
        }
        return a / getGrades().length * 100 / 100;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
