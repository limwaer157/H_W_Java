package Занятия.Обработка_ошибок.Seminar_3.Task_2;

import java.util.Arrays;
import java.util.Random;

// TODO: 04.08.2023 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//  При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//TODO Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//TODO В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
// и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
public class Main {
    public static void main(String[] args) {
        try {
        String[][] array = fullArray();
        System.out.println(checkArray(array));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }

    static int checkArray(String[][] array) {
        int result = 0;
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length == 4) {
                    for (int j = 0; j < array[i].length; j++) {
//                        if (array[i][j].matches("[0-9]+")){
//                            throw new MyArraySizeException()
//                        }
                        int a = 0;
                        try {
                            a = Integer.parseInt(array[i][j]);
                            result += a;
                        } catch (NumberFormatException e){
                            throw new MyArraySizeException("Error " + " string "+ i + " columns " +j);
                        }
                    }
                }
                else throw new MyArraySizeException("Error size");
            }
        } else throw new MyArraySizeException("Error size 2");
        return result;
    }

    static String[][] fullArray() {
        String[][] array = new String[4][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(random.nextInt(1, 10));
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        array[1][3] = "q";
        return array;
    }
}
