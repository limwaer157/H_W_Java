package org.example.Семинары.ООП.Семинар_3;
//2)Создать коробку с числами(BoxWithNumber) и найти среднее значение(average) и сравнение средних(compareAverage).
public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Double> boxWithNumber = new BoxWithNumber(1,2,3,4);

        System.out.println("boxWithNumber.avarage() = " + boxWithNumber.avarage());

        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber(1,2,3,4);
        System.out.println("boxWithNumber.compareAvarage(boxWithNumber2) = " + boxWithNumber.compareAvarage(boxWithNumber2));
    }
}
