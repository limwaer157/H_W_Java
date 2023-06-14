package Семинары.Seminar_3.ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько делать Item'ов - ");
        int n = scanner.nextInt();
        List<Item> itemList = generateCollection(n,scanner);
        System.out.println("itemList = " + itemList);
        String searhName = scanner.nextLine();
        int sumVolume = 0;
        List<String> countryList = new ArrayList<String>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searhName)) {
                sumVolume = sumVolume + itemList.get(i).getVolume();
                System.out.println(sumVolume);
                countryList.add(itemList.get(i).getCountry());
            }
        }
        System.out.println(countryList);
  }
    private static ArrayList<Item> generateCollection(int n, Scanner scanner) {
        ArrayList<Item> collection = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            System.out.printf("Введите  %d  элемент ", i);
            Item item1 = new Item();
            item1.setName(scanner.nextLine());
            item1.setCountry(scanner.nextLine());
            item1.setVolume(scanner.nextInt());
            collection.add(item1);
        }
//        collection.add(item2);
//        collection.add(item3);
        return collection;
    }
}
