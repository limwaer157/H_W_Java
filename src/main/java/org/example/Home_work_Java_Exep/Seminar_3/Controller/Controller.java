package org.example.Home_work_Java_Exep.Seminar_3.Controller;

import org.example.Home_work_Java_Exep.Seminar_3.Service.PersonCheck;
import org.example.Home_work_Java_Exep.Seminar_3.Service.WorkWithPerson;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    PersonCheck personCheck = new PersonCheck();
    WorkWithPerson workWithPerson = new WorkWithPerson();
    public void start() {
        String text = """
                Enter what you need\s
                1.Add Person\s
                2.End work.""";
        System.out.println(text);
        int a = scanner.nextInt();
        if (a == 1) {
            personCheck.chekInFile(workWithPerson.askAllData());
        }
        if (a == 2) {
            System.out.println("Goodbye");
        }
    }

}
