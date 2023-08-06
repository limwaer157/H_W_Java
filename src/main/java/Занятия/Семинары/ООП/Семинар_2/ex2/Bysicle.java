package Занятия.Семинары.ООП.Семинар_2.ex2;

public class Bysicle implements Transport {
    @Override
    public void start() {
        System.out.println("B-cle run");
    }

    @Override
    public void stop() {
        System.out.println("b-cle stop");
    }
}
