package Занятия.Java_OOП.Урок_5.controller;

import Занятия.Java_OOП.Урок_5.Model.AbstractUser;
import Занятия.Java_OOП.Урок_5.Model.Student;
import Занятия.Java_OOП.Урок_5.Model.Teacher;
import Занятия.Java_OOП.Урок_5.Model.Type;
import Занятия.Java_OOП.Урок_5.Service.DataService;
import Занятия.Java_OOП.Урок_5.Service.UserService;
import Занятия.Java_OOП.Урок_5.View.StudenView;
import Занятия.Java_OOП.Урок_5.View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudenView studenView = new StudenView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String name, String lastName, int valuation, int classNumber) {
        service.userCreate(name, lastName, valuation, classNumber, Type.STUDEND);
    }
    public void createTeacher(String name, String lastName, int salary) {
        service.userCreate(name, lastName, salary, Type.TEACHER);
    }
    public void showSalaryTeacher() {
        List<AbstractUser> teacher = service.readOnlyTeacher();
        for (AbstractUser user : teacher) {
            teacherView.printSalary(((Teacher) user));
        }
    }
    public void getAllStudents() {
        List<AbstractUser> students = service.readOnlyStudents();
        for (AbstractUser student : students) {
            Student student1 = ((Student) student);
            studenView.printConsole(student1);
        }
    }

    public void showAllStudentinClass(int a) {
        List<Student> studentsInClass = service.readOnlyStudents();
        for (int i = 0; i < studentsInClass.size(); i++) {
            if (studentsInClass.get(i).getClassNumber() == a)
                studenView.printConsole(studentsInClass.get(i));
        }
    }
}
