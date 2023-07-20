package Занятия.Java_OOП.Урок_3.iterator;

import java.util.Comparator;

public class SalaryComporator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.getSalary(),o2.getSalary());
    }

    @Override
    public Comparator<Worker> reversed() {
        return Comparator.super.reversed();
    }
}
