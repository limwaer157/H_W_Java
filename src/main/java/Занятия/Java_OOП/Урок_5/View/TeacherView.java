package Занятия.Java_OOП.Урок_5.View;

import Занятия.Java_OOП.Урок_5.Model.Teacher;

import java.util.Collections;
import java.util.Comparator;

public class TeacherView {
    public void printSalary(Teacher teacher){
        System.out.println(teacher.getTeacherId()+"   " + teacher.getSalary());
    }
}
