package org.example.Home_work_Java_Exep.Seminar_2.Task_1;

import java.util.Scanner;

public class ShowNum implements EnterNum {


    Scanner scanner = new Scanner(System.in);

    @Override
    public void enterNum() {
        boolean flag = false;
        while (!flag) {
            System.out.print("Enter number - ");
            String enter = scanner.next();
            if (enter == null) {
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
