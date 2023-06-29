package org.example.Home_work_OOP.Seminar_1;


public class Category {
    private String nameCategory;
    private String[] arrayTovarov;

    public Category(String nameCategory, String[] arrayTovarov) {
        this.nameCategory = nameCategory;
        this.arrayTovarov = arrayTovarov;
    }

    public Category() {
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String[] getArrayTovarov() {
        return arrayTovarov;
    }

    public void setArrayTovarov(String[] arrayTovarov) {
        for (int i = 0; i < arrayTovarov.length; i++) {
        this.arrayTovarov[i] = arrayTovarov[i];}
    }
}