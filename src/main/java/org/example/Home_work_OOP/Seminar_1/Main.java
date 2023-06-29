package org.example.Home_work_OOP.Seminar_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Category> categoriiTovarov = fullCategory();
        List<Tovar> allTovar = fullArray();
        List<Tovar> buyTovar = new ArrayList<>();
        Basket basket = new Basket();
        menu(scanner, allTovar, buyTovar,basket);
        User user1 = new User(basket.getBuyTovar(),"qwerty","qwer@gmail.com");
        User user2 = new User(basket.getBuyTovar(),"ytrewq","rewq@gmail.com");

    }
    /**
     * метод наполняющий колекцию с категориями продуктов
     *
     * @returnвозвращает колекцию с категориями продуктов
     */
    private static List<Category> fullCategory() {
        List<Category> categoriesTovarov = new ArrayList<>();
        String[] categoriFish = {"Trecka", "Tuna"};
        String[] categoriMeat = {"Chicken", "Cow"};
        Category category1 = new Category("Fish", categoriFish);
        Category category2 = new Category("Meat", categoriMeat);
        categoriesTovarov.add(category1);
        categoriesTovarov.add(category2);
        return categoriesTovarov;
    }

    /**
     * Основное меню пользователя
     *
     * @param scanner  дя считывания выбора из списка
     * @param allTovar все товары
     */
    private static void menu(Scanner scanner, List<Tovar> allTovar, List<Tovar> buyTovar,Basket basket) {
        String text = "Что хотите сделать \n" +
                "1 Вывести список всех продуктов \n" +
                "2 Вывести список покупок \n" +
                "3 Выбрать  продукты\n" +
                "4 Закончить покупки\n";
        System.out.print(text);
        int a = scanner.nextInt();
        while (a != 4) {
            if (a == 1) {
                showTovar(allTovar);
                System.out.print(text);
                a = scanner.nextInt();
            }
            if (a == 2) {
                showPokupki(buyTovar);
                System.out.print(text);
                a = scanner.nextInt();
            }
            if (a == 3) {
                buyTovar = pokypki(allTovar, scanner,basket);
                System.out.print(text);
                a = scanner.nextInt();
            }
        }
    }

    /**
     * Метод для выбора покупок и добавлением в список покупо и удалением из списка товаров
     * @param allTovar все товары
     * @param scanner для ыбора польователем
     * @return возврат списка покупок
     */
    private static List<Tovar> pokypki(List<Tovar> allTovar, Scanner scanner,Basket basket) {
        List<Tovar> buyTovar = new ArrayList<>();
        String[] strBasket = new String[allTovar.size()];
        for (int i = 0; i < allTovar.size(); i++) {
            System.out.print("Товар " + (i + 1) + " Наименование " +
                    allTovar.get(i).getNameTavara() +
                    " цена " + allTovar.get(i).getPrice() +
                    " рейтинг " + allTovar.get(i).getRating() + "\n");
            System.out.print("Нажмите 1 если хотите добваить в свой список покупок ?");
            if (scanner.nextInt() == 1) {
                buyTovar.add(allTovar.get(i));
                strBasket[i] = allTovar.get(i).getNameTavara();
                allTovar.remove(i);
                i = i - 1;
            }
        }
        basket.setBuyTovar(strBasket);
        System.out.println("basket = " + Arrays.toString(basket.getBuyTovar()));
        return buyTovar;
    }
    /**
     * Метод выводящий все товары
     *
     * @param allTovar метод принимает коллекцию всех товаров
     */
    public static void showTovar(List<Tovar> allTovar) {
        for (int i = 0; i < allTovar.size(); i++) {
            System.out.print("Товар " + (i + 1) + " Наименование " +
                    allTovar.get(i).getNameTavara() +
                    " цена " + allTovar.get(i).getPrice() +
                    " рейтинг " + allTovar.get(i).getRating() + "\n");
        }
    }

    /**
     * метод наполнения коллекции товаров
     * @return  возврат коллекции товаров с добавленными продуктами
     */
    private static List<Tovar> fullArray() {
        List<Tovar> allTovar = new ArrayList<>();
        Tovar tovar1 = new Tovar("Banana", 100.0, 4.3);
        Tovar tovar2 = new Tovar("Beef", 200.0, 4.0);
        Tovar tovar3 = new Tovar("Vegetables", 500.0, 3.5);
        allTovar.add(tovar1);
        allTovar.add(tovar2);
        allTovar.add(tovar3);
        return allTovar;
    }
    /**
     * метод для вывода покупок
     * @param buyTovar коллекция с товарами
     */
    public static void showPokupki(List<Tovar> buyTovar) {
        for (int i = 0; i < buyTovar.size(); i++) {
            System.out.print("Товар " + (i + 1) + " Наименование " +
                    buyTovar.get(i).getNameTavara() +
                    " цена " + buyTovar.get(i).getPrice() +
                    " рейтинг " + buyTovar.get(i).getRating() + "\n");

        }
    }
}
