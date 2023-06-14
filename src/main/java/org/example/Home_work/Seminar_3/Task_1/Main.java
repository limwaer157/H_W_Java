package org.example.Home_work.Seminar_3.Task_1;

import java.util.ArrayList;
import java.util.List;
//1. Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1-го или 2-го сорта среди товаров, название которых содержит «высший».
public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("колбаса высший сорт",150,1);
        Tovar tovar2 = new Tovar("пельмени высший категории",500,2);
        Tovar tovar3 = new Tovar("чай",200,3);
        Tovar tovar4 = new Tovar("макароны высший сорт",300,1);
        Tovar tovar5 = new Tovar("картошка",100,3);
        Tovar tovar6 = new Tovar("сосиски",480,1);
        List<Tovar> tovar = new ArrayList<>();
        tovar.add(tovar1);
        tovar.add(tovar2);
        tovar.add(tovar3);
        tovar.add(tovar4);
        tovar.add(tovar5);
        tovar.add(tovar6);
        List<Tovar> tovarMax = new ArrayList<>();
        List<Tovar> sortTovara = new ArrayList<>();
        for (Tovar tovari : tovar) {
            if ( tovari.getSort() == 1 || tovari.getSort() == 2)
                if(tovari.getGoods().contains(" высший "))
                    sortTovara.add(tovari);
        }
        System.out.println("sortTovara = " + sortTovara);
        int max =0;
        int max2 =0;
        for (int i = 0; i < sortTovara.size(); i++) {
            if (sortTovara.get(i).getPrice() > max)
                max = sortTovara.get(i).getPrice();
            else if (max2<=sortTovara.get(i).getPrice())
                max2 = sortTovara.get(i).getPrice();
        }
        System.out.println("Наибольшая цена товара - " + max + ". Наибольшая цена второго товара - " + max2);
    }
}
