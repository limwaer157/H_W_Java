package org.example.Home_work.Seminar_6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class laptop {
    private String opSistem;
    private Integer amountRAM;
    private Integer volume;
    private String proizvoditel;
    private String color;
    @Override
    public String toString() {
        return "{ Ноутбук - " + proizvoditel +
                ", Операционная система = '" + opSistem +
                ", Оперативная память = " + amountRAM + " GB" +
                ", Обьем памяти = " + volume + " GB" +
                ", Цвет = '" + color + '\'' + " }" + "\n";
    }
   public static List<String>  filterLaptop(){
        List<String> list = new ArrayList<>();
        list.add("proizvoditel");
        list.add("opSistem");
        list.add("amountRAM");
        list.add("volume");
        list.add("color");
        return  list;
   }
}

