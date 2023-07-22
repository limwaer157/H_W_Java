package org.example.Home_work_OOP.finalTask.Model;

import org.example.Home_work_OOP.finalTask.Controller.Controller;

import java.util.Scanner;

public class Operations extends CalculateModel {
    Scanner scanner = new Scanner(System.in);
    public int getValue(String title) {
        System.out.printf("%s", "Enter number for " + title +" : ");
        return scanner.nextInt();
    }
    @Override
    public String addition() {

        a1 = getValue("a1");
        b1 = getValue("b1");
        a2 = getValue("a2");
        b2 = getValue("b2");
        int a = a1 + a2;
        int b = b1 + b2;
        if (b > 0) {
            return a + "+" + b + "i";
        } else return a + " " + b + "i";
    }

    @Override
    public String multiplication() {
        a1 = getValue("a1");
        b1 = getValue("b1");
        a2 = getValue("a2");
        b2 = getValue("b2");
        int a = (a1 * a2 - b1 * b2);
        int b = (a1 * b2 + b1 * a2);
        if (b > 0) {
            return a + "+" + b + "i";
        } else return a + " " + b + "i";
    }

    @Override
    public String division() {
        a1 = getValue("a1");
        b1 = getValue("b1");
        a2 = getValue("a2");
        b2 = getValue("b2");
        int a = (a1 * a2 + b1 * b2) / a2 * a2 + b2 * b2;
        int b = (a2 * b1 - a1 * b2) / a2 * a2 + b2 * b2;
        if (b > 0) {
            return a + "+" + b + "i";
        } else return a + " " + b + "i";
    }
}
