package org.example.Home_work.Seminar_4.Task_1;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//1 -> 2->3->4
//Вывод:
//4->3->2->1
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int n = scanner.nextInt();
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addFirst(scanner.nextInt());
        }
        System.out.println("list = " + list);
    }
}
