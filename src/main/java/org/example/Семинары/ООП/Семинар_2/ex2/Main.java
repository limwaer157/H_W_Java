package org.example.Семинары.ООП.Семинар_2.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("+");
        Human human = new Human();
        Car car = new Car();
        Skate skate = new Skate();
        human.drive(skate);
        human.stop();

    }
}
