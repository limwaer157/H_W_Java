package org.example.Home_work.Seminar_3.Task_4;

import com.google.common.math.Stats;

import java.util.*;

import static com.google.common.base.Preconditions.checkState;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Stats.meanOf(list));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }
}