package org.example.Home_work.Seminar_3.Task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
// Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания после 2010 г, включительно.
public class Book {
    private String name;
    private String lastName;
    private int price;
    private int year;
    private int pages;
}
