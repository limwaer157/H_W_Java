package org.example.Home_work.Seminar_3.Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Russia",5.5,100,1);
        Tovar tovar2 = new Tovar("USA",12.4,300,1);
        Tovar tovar3 = new Tovar("Egypt",9.5,150,1);
        Tovar tovar4 = new Tovar("Georgia",8.5,400,3);
        List<Tovar> tovar = new ArrayList<>();
        tovar.add(tovar1);
        tovar.add(tovar2);
        tovar.add(tovar3);
        tovar.add(tovar4);
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter sort -  ");
        int min = tovar.get(1).getPrice();
        int min2 = tovar.get(1).getPrice();;
        int n = scanner.nextInt();
        for (int i = 0; i <tovar.size() ; i++) {
            if(tovar.get(i).getSort() == n)
                if (tovar.get(i).getPrice() < min)
                    min = i;
                else if (min2 > tovar.get(i).getPrice())
                    min2 = i;
        }
        List<Tovar> result =new ArrayList<>();
        result.add(tovar.get(min));
        result.add(tovar.get(min2));
        System.out.println(min2);
        System.out.println("result = " + result.get(min).getCountry());
        System.out.println("result = " + result.get(min2-1).getCountry());
    }
}
