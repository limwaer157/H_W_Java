package Занятия.Семинары.Java.Seminar_6.ex2;

public class Main {
    public static void main(String[] args) {
        double temp = 35.0;
        System.out.println("temp Faren = " + new Fareng().convert(temp));
        System.out.println("temp Cels  = " + new Cels().convert(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convert(temp));
        Converter result = new Cels();
        System.out.println(((Cels) result).sum(temp));

    }
}
