package org.example.Home_work_OOP.Seminar_3;

// TODO: Дописать игру быки-коровы
//- на русском и английском алфавите
//- сделать логирование действий и по запросу пользователя посмотреть всю историю игры
//- реализовать перезапуск игры

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For ENG 1 For RUS 2 For NUM 3");
        int a = scanner.nextInt();

        if (a == 1) {
            EnglishWord englishWord = new EnglishWord();
            System.out.print("Enter size of word and how many tries - ");
            englishWord.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!englishWord.maxTry.equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = englishWord.inpuValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                }
            }
        } else if (a == 2) {
            RusWord rusWord = new RusWord();
            System.out.println("Enter size of word and how many tries - ");
            rusWord.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!rusWord.maxTry.equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = rusWord.inpuValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                }
            }
        } else if (a == 3) {
            NumberGame numberGame = new NumberGame();
            System.out.println("Enter size of word and how many tries - ");
            numberGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!numberGame.maxTry.equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = numberGame.inpuValue(value);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                }
            }
        }
    }
}
