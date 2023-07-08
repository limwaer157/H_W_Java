package org.example.Home_work_OOP.Seminar_4;

import java.util.Arrays;
import java.util.List;

public class Calculate<E> {
    private E[] number;

    public Calculate(E... number) {
        this.number = number;
    }

    public Calculate() {
    }


    public Double multiplication(List<? extends Number> list) {
        double result = 1;
        for (Number element : list) {
            result += result * element.doubleValue();
        }
        return result;
    }

    public E[] getNumber() {
        return number;
    }

    public void setNumber(E[] number) {
        this.number = number;
    }

    public Double division(List<? extends Number> numbersDivision) {
        return numbersDivision.get(0).doubleValue() / numbersDivision.get(1).doubleValue();
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "number=" + Arrays.toString(number) +
                '}';
    }

    public String numberToSecondSystem(E a) {
        StringBuilder result = new StringBuilder();
        if (a instanceof Integer) {
            int b = (Integer) a;
            while (b >= 1) {
                if (b % 2 == 1) {
                    result.append("1");
                } else result.append("0");
                b = b / 2;
            }
        }
        if (a instanceof String) {
            int b = Integer.parseInt((String) a);
            while (b >= 1) {
                if (b % 2 == 1) {
                    result.append("1");
                } else result.append("0");
                b = b / 2;
            }
        }
        return result.reverse().toString();
    }
}
