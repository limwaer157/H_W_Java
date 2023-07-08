package org.example.Home_work.Seminar_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class cruateLaptop {
    /**
     * Создаем множества компьютеров.
     * @return Возвращаем коллекцию компьютеров с характеристиками.
     */
    protected static List<laptop> generateLaptop() {
        System.out.print("Количество компьютеров в магазине - ");
        Scanner scanner = new Scanner(System.in);
        int numberLaptop = scanner.nextInt();
        List<laptop> laptopList = new ArrayList<>();
        Random random = new Random();
        String[] color = {"blue", "black", "green", "orange", "grey", "white"};
        String[] proizv = {"Aser", "Asus", "MacBook", "Dell", "Honor", "Huawei"};
        for (int i = 0; i < numberLaptop; i++) {
            laptop laptop1 = new laptop();
            laptop1.setAmountRAM(random.nextInt(4, 33));
            laptop1.setVolume(random.nextInt(100, 1000));
            int os = random.nextInt(0, 6);
            laptop1.setProizvoditel(proizv[os]);
            if (os == 2) {
                laptop1.setOpSistem("MacOC");
            } else laptop1.setOpSistem("Windows");
            laptop1.setColor(color[random.nextInt(0, 6)]);
            laptopList.add(laptop1);
        }
        return laptopList;
    }
}
