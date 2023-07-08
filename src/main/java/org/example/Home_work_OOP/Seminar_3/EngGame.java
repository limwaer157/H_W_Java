package org.example.Home_work_OOP.Seminar_3;

import java.util.List;
import java.util.Random;

public abstract class EngGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
//        System.out.println("computerWord = " + computerWord);
        this.gameStatus = GameStatus.START;
        currentTry = 0;
    }

    @Override
    public Answer inpuValue(String value) {
        if (currentTry >=  maxTry) {
            gameStatus = GameStatus.FINISH;
            System.out.println("Game finish");
            return null;
        }
        int cow = 0;
        int bull = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                bull = bull + 1;
                cow = cow + 1;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                cow = cow + 1;
            }
        }
        currentTry = currentTry + 1;
        if (sizeWord.equals(bull)) {
            gameStatus = GameStatus.FINISH;
            System.out.println("You Win");
            return null;
        }

        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateEngCharList();

    private String generateWord() {
        Random random = new Random();
        List<String> charList = generateEngCharList();
        String result = "";
        // TODO: генерируем слова
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            result = result + (charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return result;
    }

    @Override
    public  String logInfo() {
        return null;
    }
}
