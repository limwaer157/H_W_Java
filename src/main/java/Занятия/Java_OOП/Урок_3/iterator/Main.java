package Занятия.Java_OOП.Урок_3.iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Random r = new Random();
        Worker worker1 = new Worker("Ivan","Vasiliev",25,45633);
//        Worker worker2 = new Worker("Dima","Ivanov",48,30000);
//        Worker worker3 = new Worker("Alex","Blinov",30,83240);
        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new Worker("Name " + i ,"LastName" + i ,r.nextInt(18,50),r.nextInt(2000,3000) ));
        }
        System.out.println(workers);
//        Collections.sort(workers);
//        System.out.print(workers);

        workers.sort((w1,w2)-> Integer.compare(w1.getAge(),w2.getAge()));
        System.out.println(workers);

        System.out.println(workers);
    }
}
