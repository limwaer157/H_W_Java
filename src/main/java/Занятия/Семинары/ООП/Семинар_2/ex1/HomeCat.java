package org.example.Семинары.ООП.Семинар_2.ex1;

public class HomeCat extends Cat{
    protected static int count;

    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Кот", maxRunDistance, maxSwimDistance);
    }
    public HomeCat() {
    }
}
