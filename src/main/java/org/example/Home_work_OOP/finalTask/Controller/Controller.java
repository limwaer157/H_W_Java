package org.example.Home_work_OOP.finalTask.Controller;

import org.example.Home_work_OOP.finalTask.Model.Operations;
import org.example.Home_work_OOP.finalTask.Service.Logger;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    Operations operations = new Operations();
    Logger log = new Logger();

    protected void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }

    public void  startCalc(){
        String text = "Выверети действие : " + "\n" +
                "1 - Addition " +"\n" +
                "2 - Multiplication" +"\n" +
                "3 - Divicion ";
        System.out.println(text);
        int a = scanner.nextInt();
        if (a == 1 ){
            String result = (operations.addition());
            System.out.print(result);
            log.printTofile(result);
        }
        if (a == 2 ){
            String result = (operations.multiplication());
            System.out.print(result);
            log.printTofile(result);        }
        if (a == 3 ){
            String result = (operations.division());
            System.out.print(result);
            log.printTofile(result);        }
    }
}
