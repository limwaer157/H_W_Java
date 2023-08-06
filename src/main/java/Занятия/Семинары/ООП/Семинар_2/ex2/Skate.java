package Занятия.Семинары.ООП.Семинар_2.ex2;

public class Skate implements Transport {
    @Override
    public void start() {
        System.out.println("skate run");
    }

    @Override
    public void stop() {
        System.out.println("skate stop");
    }
}
