package Занятия.Java_OOП.Урок_5;

import Занятия.Java_OOП.Урок_5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        int a =5;
        controller.createStudent("qwe","qwe",5,5);
        controller.createStudent("qwe","qwe",5,4);
        controller.createStudent("qwe","qwe",5,5);
        controller.createTeacher("QWE","qwe",2000);
        controller.createTeacher("QWE","qwe",21000);

        controller.showSalaryTeacher();

        controller.showAllStudentinClass(a);
    }

}
