package org.example.Home_work.Seminar_3.Task_3;

import java.util.ArrayList;
import java.util.List;

// Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания после 2010 г, включительно.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Детектив", "Астафьев", 1000, 2011, 97);
        Book book2 = new Book("Введение в математику", "Викторова", 1000, 2008, 50);
        Book book3 = new Book("Загадки", "Курочкина", 1000, 2010, 5);
        Book book4 = new Book("Сборник по физике", "Васильев", 1000, 2011, 40);
        List<Book> book = new ArrayList<>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        for (Book book5 : book) {
            boolean flag = numberSimple(book5.getPages());
            if (flag && book5.getYear() >= 2010 && book5.getLastName().contains("а")) {
                System.out.println("+");
            }
        }
    }
    /**
     *
     * @param num Определяем является ли число простым
     * @return возвращаем true или false
     */
    private static boolean numberSimple(int num) {
        boolean flag = true;
        for (int i = 2; i <= num / 2; i++) {
            int temp = num % i;
            if (temp == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}