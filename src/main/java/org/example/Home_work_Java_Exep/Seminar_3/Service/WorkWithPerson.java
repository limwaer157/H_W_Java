package org.example.Home_work_Java_Exep.Seminar_3.Service;

import org.example.Home_work_Java_Exep.Seminar_3.Exceptions.ErrorEnterException;
import org.example.Home_work_Java_Exep.Seminar_3.Exceptions.NeedMoreDataExceptions;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithPerson implements ServisePerson {

    Scanner scanner = new Scanner(System.in);
    SaveFile save = new SaveFile();

    @Override
    public String askAllData() {
        String text = "Enter data  - ";
        System.out.print( text);
        return scanner.nextLine();
    }


    @Override
    public void showErrorNoData(int errorNumber) throws IllegalArgumentException {
        if (errorNumber == 1) {
            throw new NeedMoreDataExceptions("Need more data about person");
        }
        if (errorNumber == 2) {
            throw new ErrorEnterException("You enter something wrong");
        }
    }
}
