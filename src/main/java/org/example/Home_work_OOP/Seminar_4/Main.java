package org.example.Home_work_OOP.Seminar_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Number> number = new ArrayList<>(Arrays.asList(2,5,8.5));
        Calculate calculate = new Calculate();
        System.out.println("calculate.multiplication(number) = " + calculate.multiplication(number));

        List<Number> numbersDivision = new ArrayList<>(Arrays.asList(10, 2));
        System.out.println("calculate.division(numbersDivision) = " + calculate.division(numbersDivision));

        Calculate calculateStringAndInt = new Calculate<>();

        String a = "25";
        System.out.println("calculate.numberToSecondSystem(a) = " + calculateStringAndInt.numberToSecondSystem(a));

        int b = 45;
        System.out.println("calculate.numberToSecondSystem(a) = " + calculateStringAndInt.numberToSecondSystem(b));
    }
}
