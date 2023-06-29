package Семинары.Java.Seminar_6.ex2;

public class Fareng implements Converter {
    @Override
    public Double convert(Double num) {
        return num * 9.0 / 5.0 + 32;
    }
}
