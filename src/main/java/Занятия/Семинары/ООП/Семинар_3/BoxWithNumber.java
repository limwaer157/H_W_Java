package org.example.Семинары.ООП.Семинар_3;

import lombok.Data;

import java.util.Arrays;

@Data
public class BoxWithNumber <E extends Number>    {
   private E[] num;

    public BoxWithNumber(E... num) {
        System.out.println("this = " + this);
        this.num = num;
    }

    public double avarage() {
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i].doubleValue();
        }
        return  result / num.length;
    }

    public boolean compareAvarage(BoxWithNumber<? extends Number> boxWithNumber2) {
        return (this.avarage() == boxWithNumber2.avarage());
    }

    @Override
    public String toString() {
        return "BoxWithNumber{" +
                "num=" + Arrays.toString(num) +
                '}';
    }
}
