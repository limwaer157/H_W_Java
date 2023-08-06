package Занятия.Семинары.Java.Seminar_6.ex1;

import java.util.*;

//1) Дан массив чисел, посчитать процент уникальных чисел.
//Процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 9, 7};
        ExclusiveNumbers(array);
        List<String> set1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> set2 = new ArrayList<>(Arrays.asList("qwe", "v"));
        List<String> set3 = new ArrayList<>(set1);
        set3.containsAll(set2);
        System.out.println(set3);


    }

    /**
     * Поиск процента уникальных чисел
     * @param array массив в котором ищем количество униальных значений
     */
    private static void ExclusiveNumbers(int[] array) {
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!num.contains(array[i])) {
                num.add(array[i]);
            }
        }
        int result = num.size() * 100 / array.length;
        System.out.println(result);
    }


//Найти пересечения слов в массивах и указать их общее количество.
//Пример:
//Mas1= [“qwe”,”asd”,”qwe”,”x”]
//Mas2=[“qwe”,”v”]
//Результат:
//qwe=3

}
