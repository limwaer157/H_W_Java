package org.example.Home_work.Seminar_6;

import java.util.*;

public class choiceLaptop {
    laptop laptopCharacter = new laptop();
;
    private Map<String, String> endCriteri = new HashMap<>();
    private List<laptop> listXap = cruateLaptop.generateLaptop();

    /**
     * метод для выбора действий
     * @return число выбранного метода
     */
    private int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что хотите сделать ? \n" +
                "1 - Задать значение \n" +
                "2 - Посмотреть список\n" +
                "3 - Создать множество ноутбуков\n" +
                "4 - Подобрать ноутбук по критериям\n" +
                "5 - Завершить\n");
        return scanner.nextInt();
    }

    /**
     * метод начала работы программы
     */
    protected void begin() {
        int menu = menu();
        while (menu != 5) {
            if (menu == 1) {
                Map endCriteri = setValue();
                System.out.println("Значения сохранены ");
                menu = menu();
            }
            if (menu == 2) {
                showlList();
                menu = menu();
            }
            if (menu == 3) {
//                List<laptop> listXap = cruateLaptop.generateLaptop();
                System.out.println("Множество ноутбуков - " + listXap);
                menu = menu();
            }
            if (menu == 4) {
                choiceLaptop(endCriteri, listXap);
                menu = menu();
            }
        }
    }

    /**
     * метод для просмотра критерий от пользователя
     */
    private void showlList() {
        System.out.println("Cписок Ваших критерий -  " + endCriteri);
    }

    /**
     * метод для ввода пользователем критерий
     * @return возвращает коллекцию с критериями заданную пользователем
     */
    private Map setValue() {
        List<String> list = filterLaptop();
        laptop laptop = new laptop();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (list.get(i).equals("proizvoditel")) {
                String[] proizv = {"Aser", "Asus", "Apple", "Dell", "Honor", "Huawei"};
                System.out.println("Введите значение для - " + list.get(i) + " из списка - " + Arrays.toString(proizv));
                endCriteri.put(list.get(i), scanner.next());
                continue;
            }
            if (list.get(i).equals("color")) {
                String[] color = {"blue", "black", "green", "orange", "grey", "white"};
                System.out.println("Введите значение для - " + list.get(i) + " из списка - " + Arrays.toString(color));
                endCriteri.put(list.get(i), scanner.next());
                continue;
            }
            if (list.get(i).equals("opSistem")) {
                String[] os = {"MacOC", "Widows"};
                System.out.println("Введите значение для - " + list.get(i) + " из списка - " + Arrays.toString(os));
                endCriteri.put(list.get(i), scanner.next());
                continue;
            }
            System.out.println("Введите значение для - " + list.get(i));
            endCriteri.put(list.get(i), scanner.next());
        }
        System.out.println("Ваши критерии для выбора = " + endCriteri);
        return endCriteri;
    }

    /**
     * метод с критериями по которым сравниваем
     * @return возвращаем лист с наименованиями критерий
     */
    private static List<String> filterLaptop() {
        List<String> list = new ArrayList<>();
        list.add("proizvoditel");
        list.add("opSistem");
        list.add("amountRAM");
        list.add("volume");
        list.add("color");
        return list;
    }

    /**
     * Метод для ввода минимального значения для поиска
     * @return мин число для поиска
     */
    private int choiceMax() {
        System.out.println("Enter max value - ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    /**
     *  Метод для ввода максимального значения для поиска
     * @return макс число для поиска
     */
    private int choiceMin() {
        System.out.println("Enter min value - ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    /**
     * Метод для поиска по нужным критериям
     * @param endCriteri критерии для поиска от пользователя
     * @param listXap лист с ноутбуками из которых выбираем для сравнения
     */
    private void choiceLaptop(Map<String, String> endCriteri, List<laptop> listXap) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayLaptopIndex = new int[listXap.size()];
        int j = 0;
        System.out.print("По какому критерию хотите выбирать \n" +
                "1 Производитель \n" +
                "2 Операционная система \n" +
                "3 Оперативная память \n" +
                "4 Обьем памяти \n" +
                "5 Цвет \n");
        int num = scanner.nextInt();
        if (num == 1) {
            for (int i = 0; i < listXap.size(); i++) {
                if (endCriteri.get("proizvoditel").equals(listXap.get(i).getProizvoditel())) {
                    arrayLaptopIndex[j] = i;
                    j++;
                }
            }
        }
        if (num == 2) {
            for (int i = 0; i < listXap.size(); i++) {
                if (endCriteri.get("opSistem").equals(listXap.get(i).getOpSistem())) {
                    arrayLaptopIndex[j] = i;
                    j++;
                }
            }
        }
        if (num == 3) {
            int max = choiceMax();
            int min = choiceMin();
            for (int i = 0; i < listXap.size(); i++) {
                int a = Integer.parseInt(endCriteri.get("amountRAM"));
                if (listXap.get(i).getAmountRAM() <= max && listXap.get(i).getAmountRAM() >= min) {
                    arrayLaptopIndex[j] = i;
                    j++;
                    System.out.println("arrayLaptopIndex = " + Arrays.toString(arrayLaptopIndex));
                }
            }
        }
        if (num == 4) {
            int maxValue = choiceMax();
            int minValue = choiceMin();
            for (int i = 0; i < listXap.size(); i++) {
                int a = Integer.parseInt(endCriteri.get("volume"));
                if (listXap.get(i).getVolume() <= maxValue && listXap.get(i).getVolume() >= minValue) {
                    arrayLaptopIndex[j] = i;
                    j++;
                }
            }
        }
        if (num == 5) {
            for (int i = 0; i < listXap.size(); i++) {
                if (endCriteri.get("color").equals(listXap.get(i).getColor())) {
                    arrayLaptopIndex[j] = i;
                    j++;
                }
            }
        }
        for (int i = 0; i < arrayLaptopIndex.length - 1; i++) {
            if (arrayLaptopIndex[2] == 0 || arrayLaptopIndex[i + 1] == 0) {
                System.out.println("Вам подходят вот эти ноутбуки -  " + listXap.get(arrayLaptopIndex[i]));
                break;
            } else System.out.println("Вам подходят вот эти ноутбуки -  " + listXap.get(arrayLaptopIndex[i]));
        }
    }
}

