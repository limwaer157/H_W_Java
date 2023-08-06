package Занятия.Семинары.Java.Seminar_5;

import java.util.HashMap;
import java.util.Map;

//1)	Посчитать количество вхождений каждого символа в текст.
public class ex1 {
    public static void main(String[] args) {
        String str = "qwer qwes qweas xlkmn";
//        extracted(str);
//        2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
        int [] array = {1,2,3,4,5,6,7,8,9,1};
        System.out.println(Solution(array));
        String number = "MCMXCIV";
        Map<Character,Integer> rim = new HashMap<>();
        rim.put('I',1);
        rim.put('V',5);
        rim.put('X',10);
        rim.put('L',50);
        rim.put('C',100);
        rim.put('D',500);
        rim.put('M',1000);
        System.out.println(Rim(number,rim));
    }
    private static boolean Solution(int [] array){
        boolean flag = false;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else {flag = true;
            break;}
        }
        return flag;
    }

    private static void extracted(String str) {
        Map<Character,Integer> collection = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!collection.containsKey(str.charAt(i))){
                collection.put(str.charAt(i),1);
            }
            else {
                collection.put(str.charAt(i),collection.get(str.charAt(i))+1);
            }
        }
        for (Map.Entry<Character,Integer> item:collection.entrySet()) {
            System.out.println(item.getKey() +"  "+ item.getValue());
        }
    }

// I 1
//V 5
//X 10
//L 50
//C 100
//D 500
//M 1000
//Примеры:
//1)	ввод: s = "LVIII"
//              вывод: 58
//              разбор: L = 50, V= 5, III = 3.
//2)	ввод: s = "MCMXCIV"
//вывод: 1994
//разбор: M = 1000, CM = 900, XC = 90 and IV = 4.

    private static int Rim(String number,Map<Character,Integer> rim){
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == 'C') {
                if (number.charAt(i + 1) == 'M') {
                    result = result + 900;
                    i = i + 2;
                }
                if (number.charAt(i) == 'X') {
                    result = result + 90;
                    i = i + 2;
                }
            }
                else if (number.charAt(i)=='V') {
                    if (number.charAt(i - 1) == 'I') {
                        result = result + 4;
                        i = i + 2;
                    }
                    else result = result + rim.get(number.charAt(i));
                }
                else result = result + rim.get(number.charAt(i));
        }
        return result;
    }

}
