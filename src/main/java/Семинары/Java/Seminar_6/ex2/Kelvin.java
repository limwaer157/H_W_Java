package Семинары.Java.Seminar_6.ex2;

public class Kelvin implements Converter{
    @Override
    public Double convert(Double num) {
        return num + 273.15;
    }
}
