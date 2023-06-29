package Семинары.Java.Seminar_4;

import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number - ");
        int n = scanner.nextInt();
        LinkedList<Integer> arrayList = generateList(n);
          System.out.print("linkedList = " + arrayList);
//        System.out.print("Summ(arrayList) = " + Summ(arrayList));
        int sum = Summ(arrayList);
        System.out.print("zamena(arrayList,sum) = " + zamena(arrayList, sum));
    }


    /**
     *
     * @param n длинна сипска
     * @return возвращаем новый список
     */
    private static LinkedList<Integer> generateList(int n){
        LinkedList<Integer> arrayList = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt(-100,100));
        }
        return arrayList;
    }

    /**
     *
     * @param arrayList массив в котором ищем сумму нечетных элеменотв
     * @return сумма нечетных элементов
     */
    private static int Summ(LinkedList<Integer> arrayList){
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 != 0){
                System.out.println(arrayList.get(i));
               sum = sum + arrayList.get(i);
            }
        }
        return sum;
    }

    /**
     *
     * @param arrayList
     * @param sum элемент на который заменяем все не кратные  элементы списка
     * @return массив измененный
     */
    private static LinkedList zamena(LinkedList<Integer> arrayList,int sum) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)  < 0) arrayList.remove(i);
        }
        return arrayList;
    }
    //Заменить некратные 3 элементы списка, суммой нечетных элементов.
}
