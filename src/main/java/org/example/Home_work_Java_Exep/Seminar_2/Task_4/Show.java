package org.example.Home_work_Java_Exep.Seminar_2.Task_4;

import java.util.Scanner;

public class Show implements Enter{


    Scanner scanner = new Scanner(System.in);

    @Override
    public void enterNum() {
        boolean flag = false;
        while (!flag) {
            System.out.print("Enter number - ");
            String enter = scanner.nextLine();
            if (enter == null) {
                System.out.println("Enter empty string");
                continue;
            }
            else
            {
                try {
                    if (enter.contains(".")) {
                        float enterNumber = Float.parseFloat(enter);
                        System.out.println("enterNumber = " + enterNumber);
                        flag = true;
                    }
                    else {
                        System.out.println("Try again");
                    }

                } catch (Exception e) {
                    System.out.println("Try again");
                }
            }
        }
    }
}
