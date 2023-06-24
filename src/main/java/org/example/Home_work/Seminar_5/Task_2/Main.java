package org.example.Home_work.Seminar_5.Task_2;

import com.google.common.collect.Collections2;

import java.util.*;
//Написать программу, которая найдёт и выведет повторяющиеся
// имена с количеством повторений. Отсортировать по убыванию популярности.
public class Main {
    public static void main(String[] args) {
        String[] array = {"Иван Иванов", "Анна Мусина", "Светлана Петрова", "Иван Иванов", "Иван Иванов", "Анна Мусина"};
        Map fio =  newCollection(array);
        NavigableMap<Integer, String> sortmap = new TreeMap<>();
        sortMetod(fio, sortmap);
    }
    /**
     *
     * @param array Массив строк которые проверяет на повторение
     * @return возвращает коллекцию с теми элементами которые повторялись
     */
    private static Map newCollection(String[] array) {
        Map<String, Integer> fioMap = new HashMap<>();
        for (String s : array) {
            if (!fioMap.containsKey(s)) {
                fioMap.put(s, 1);
            } else fioMap.put(s, fioMap.get(s) + 1);
        }
        return fioMap;
    }
    /**
     *
     * @param fio приниаем коллекцию которую надо отсортировать
     * @param sortmap новая коллекция в которую записываем
     */
    private static void sortMetod(Map<String, Integer> fio, NavigableMap<Integer, String> sortmap) {
        for (Map.Entry<String, Integer> entry : fio.entrySet()) {
            if (entry.getValue() < entry.getValue() + 1)
                sortmap.put(entry.getValue(), entry.getKey());
        }
        int i = sortmap.size() + 1;
        while (i >= 2) {
            System.out.println(sortmap.lowerEntry(i));
            i = i - 1;
        }
    }
}


