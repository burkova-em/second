package org.example.task6;

import java.util.Arrays;

public class AmazingString {

    char[] string;

    public AmazingString(char[] string) {
        this.string = string;
    }

    public AmazingString(String anotherString) {
        this.string = anotherString.toCharArray();
    }

    public char returnSymbol(int i) {

        for (int j = 0; j <= i; j++){
            if (j == i) {
                return string[j-1];
            }
        }
        return 0;
    }

    public int returnLength() {
        return string.length;
    }

    public void print() {
        System.out.println(string);
    }

    public boolean checkSubstringChar(char[] substring) {

        char[] full = new char[substring.length];

        for(int i = 0; i < substring.length; i++) {

            full[0] += substring[i];
           System.out.println(Arrays.toString(full));
        }

        return true;

    }

//    public boolean checkSubstringStr(String substring) {
//
//
//        return
//
//    }

//    public void deleteSymbol(){
//
//
//    }
//
//    public String unfoldString(){


    public static void main(String[] args) {

        AmazingString amazingString = new AmazingString("Beautiful");
        System.out.println(amazingString.returnSymbol(4));
        System.out.println(amazingString.returnLength());
        amazingString.print();
        char[] substringChar = {'a', 'u', 't'};
        amazingString.checkSubstringChar(substringChar);
        String substringStr = "ful";
     //   amazingString.checkSubstringStr(substringStr);

    }
}
