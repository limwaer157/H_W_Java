package org.example.Home_work_Java_Exep.Seminar_2.Task_2;

public class Main_Task_2 {
    public static void main(String[] args) {
        int [] array = new int[9];
        try {
            int d = 0;
            double catchedRes1 = (double) array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
