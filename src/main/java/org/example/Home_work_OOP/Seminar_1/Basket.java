package org.example.Home_work_OOP.Seminar_1;

import java.util.ArrayList;
import java.util.List;

//Содержит массив купленных товаров
public class Basket {
    private String[] buyTovar;

    public Basket(String[] buyTovar) {
        this.buyTovar = buyTovar;
    }
    public Basket() {
    }
    public String[] getBuyTovar() {
        return buyTovar;
    }

    public void setBuyTovar(String[] buyTovar) {
        this.buyTovar = buyTovar;
    }
}