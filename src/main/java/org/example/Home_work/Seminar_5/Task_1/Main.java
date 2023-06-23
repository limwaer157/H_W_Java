package org.example.Home_work.Seminar_5.Task_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
//Пример:
//Россия идет вперед всей планеты. Планета — это не Россия.
//Запрос: Россия
//Ответ: Россия - 2
//toLoverCase().
//(Усложнение - игнорировать пунктуацию)
public class Main {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия .";
       FindeWord(str);
    }

    /**
     *
     * @param str Строка в которой будем искать есть ли такие ключи в коллекции
     */
    private static void FindeWord(String str) {
        Map<String,Integer> maps = new HashMap<>();
        String end =  str.replaceAll("/[\\s.,%]/g","");
        String[] str1 = end.toLowerCase().split(" ");
        maps.put("россия",0);
        for (int i = 0; i < str1.length; i++) {
            if(maps.containsKey(str1[i]))
                maps.put(str1[i],maps.get(str1[i])+1);
        }
        System.out.println(maps);
    }
}
