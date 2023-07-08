package org.example.Home_work_OOP.Seminar_3;

public interface Game {
    void start(Integer sizeWord,Integer maxTry);

    Answer inpuValue(String value);

    GameStatus getGameStatus();

    String logInfo();
}
