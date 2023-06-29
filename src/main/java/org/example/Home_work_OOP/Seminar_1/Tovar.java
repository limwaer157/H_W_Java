package org.example.Home_work_OOP.Seminar_1;

public class Tovar {
    private String nameTavara;
    private Double price;
    private Double rating;

    public Tovar(String nameTavara, Double price, Double rating) {
        this.nameTavara = nameTavara;
        this.price = price;
        this.rating = rating;
    }

    public Tovar() {
    }

    public String getNameTavara() {
        return nameTavara;
    }

    public void setNameTavara(String nameTavara) {
        this.nameTavara = nameTavara;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
