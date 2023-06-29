package Семинары.Java.Seminar_3.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Иванов",5,1000,List.of(3,2,4));
        Student student2 = new Student("Петрова",7,1000,List.of(2,2,4));
        Student student3 = new Student("Сидоров",12,1000,List.of(2,3,4));
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        List<Student> result = new ArrayList<>();
        for (Student student1 : students) {
            int count = GetCount(student1.getStep());
             if (student1.getLastName().endsWith("ова") && count % 2 ==0)
                 System.out.println(student1.getMoney());
        }
        }

    private static int GetCount(List<Integer> step) {
        int sum = 0;

        for (Integer steps: step
             ) {sum = sum +  steps;
            
        }
        return sum;
    }


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Какое количество студентов - ");
//        int n = scanner.nextInt();
//        System.out.print("Какое количество оценок у студентов - ");
//        int step = scanner.nextInt();
//        List<Student> students = generateStudent(n,scanner);
//        System.out.println("students = " + students);





//    private static List<Student> generateStudent(int n, Scanner scanner) {
//        ArrayList<Student> collection = new ArrayList<>();
//        for (int i = -1; i <n ; i++) {
//            System.out.print("Введите элемент - " + i + "  ");
//            Student student = new Student();
//            student.setLastName(scanner.nextLine());
//            student.setGroup(scanner.nextInt());
//            student.setMoney(scanner.nextInt());
//            student.setStep(List.of(scanner.nextInt()));
//            collection.add(student);
//        }
//        return collection;
//    }
}
