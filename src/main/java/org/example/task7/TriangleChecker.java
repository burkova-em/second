package org.example.task7;

public class TriangleChecker {


    public static boolean calculate(double sideOne, double sideTwo, double sideThree) {

        if (sideOne > 0 && sideTwo > 0 && sideThree > 0) {
            return (sideOne + sideTwo > sideThree) || (sideOne + sideThree > sideTwo) || (sideTwo + sideThree > sideOne);
        } return false;
    }


    public static void main(String[] args) {

        System.out.println(calculate(3.2, -1, 4));
        System.out.println(calculate(1,3,3));
    }
}
