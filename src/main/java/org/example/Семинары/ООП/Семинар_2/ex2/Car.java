package org.example.Семинары.ООП.Семинар_2.ex2;

public class Car implements Transport {
    @Override
    public void start() {
        System.out.println("car run");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
