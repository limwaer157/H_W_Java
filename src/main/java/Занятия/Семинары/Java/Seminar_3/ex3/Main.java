package Занятия.Семинары.Java.Seminar_3.ex3;

import java.util.*;

//Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд)
// и материал (деревянный, металлический, картонный и тд.).
// Найти:  - количество кубиков желтого цвета и их суммарный объем;
//         - количество деревянных кубиков с ребром 3 см
public class Main {
    public static void main(String[] args) {
        Kubik cub = new Kubik(3,"Желтый","металл");
        Kubik cub2 = new Kubik(3,"Черный","Деревянный");
        Kubik cub3 = new Kubik(5,"Желтый","металл");
        List<Kubik> cubik = new ArrayList<>();
        cubik.add(cub);
        cubik.add(cub2);
        cubik.add(cub3);
        String find = "Желтый";
        int ves = 0;
        int kWood = 0;
        for (Kubik kubik : cubik) {
            int obm = Obiem(kubik.getDlina());
            if(kubik.getColor().equals(find))
              ves = ves + obm;
            if (kubik.getMaterial().equals("металл") && kubik.getDlina()==3)
                kWood++;
        }
        System.out.println("Общий обьем "  + ves);
        System.out.println(kWood);
        System.out.println("delCopy(cubik) = " + delCopy(cubik));
    }
    private static int Obiem(int dlina) {
        int obm = dlina *dlina*dlina;
        return obm;
    }

    /**
     *
     * @param cubik
     * @return уникальная коллекция
     */
    private static Collection delCopy(List<Kubik> cubik)
    {
        return new HashSet(cubik);
    }
}
