package org.example.Home_work_OOP.Seminar_2;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        CanDo[] canDo = fullPersons();
        Prepadstvie[] prepadstvies = fullPrepat();

/**
 * метод  для определения кто сможет пройти дальше или нет.
 */
        for (int i = 0; i < prepadstvies.length; i++) {
            for (int j = 0; j < canDo.length; j++) {
                int a = -1;
                if(canDo[j]!= null){
                if (prepadstvies[i].namePrep().equals("Wall")) {
                    a = canDo[j].jump(prepadstvies[i].razmerPrep());

                } else if (prepadstvies[i].namePrep().equals("RunRoad")) {
                    a = canDo[j].run(prepadstvies[i].razmerPrep());
                    if (a == 1) {
                        canDo[j] = null;
                    }
                }
                else continue;
                }
                if (a == 1) {
                    canDo[j] = null;
                }
            }
        }
    }
    /**
     * Метод для наполнения участниками
     * @return возвращает массив участников
     */
    private static CanDo[] fullPersons() {
        CanDo[] canDo = {new Human(5, 10),
                new Cat(10, 20),
                new Robot(20, 50),};
        return canDo;
    }

    /**
     * Метод для наполнения препятствиями
     * @return возващает массив препядствий
     */
    private static Prepadstvie[] fullPrepat() {
        Prepadstvie[] prepadstvies = {
                new RunRoad(9, "RunRoad"),
                new Wall(6, "Wall"),
                new Wall(15, "Wall"),
                new Wall(20, "Wall"),
                new RunRoad(50, "RunRoad")};
        return prepadstvies;
    }
}
