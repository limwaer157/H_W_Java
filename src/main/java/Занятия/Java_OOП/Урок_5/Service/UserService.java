package Занятия.Java_OOП.Урок_5.Service;

import Занятия.Java_OOП.Урок_5.Model.AbstractUser;
import Занятия.Java_OOП.Урок_5.Model.Student;
import Занятия.Java_OOП.Урок_5.Model.Teacher;
import Занятия.Java_OOП.Урок_5.Model.Type;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    int userId;
    String name;
    String lastName;
    private List<AbstractUser> userList = new ArrayList<>();



    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDEND == type;
            for (AbstractUser abstractUser : userList) {
                if (abstractUser instanceof Teacher && !isStudent) {
                    lastId++;
                }
                if (abstractUser instanceof Student && isStudent) {
                    lastId++;
                }
            }
            return ++lastId;
        }

    @Override
    public void userCreate(String name, String lastName, int valuation, int classNumber, Type type) {
        int id = getFreeId(type);
        if (Type.STUDEND == type) {
            userList.add(new Student(name, lastName, id, valuation, classNumber));
        }
    }
        public void userCreate (String name, String lastName,int salary, Type type){
            int id = getFreeId(type);
            if (Type.TEACHER == type) {
                userList.add(new Teacher(name, lastName, id, salary ));
            }
        }

    public List<AbstractUser> read() {
        return userList;
    }

    @Override
    public List readOnlyStudents() {
        List<Student> students = new ArrayList<>();
        for (AbstractUser user : userList) {
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
    @Override
    public List<AbstractUser> readOnlyTeacher() {
        List<AbstractUser> salaryList = new ArrayList<>();
        for (AbstractUser user : userList) {
            if (user instanceof Teacher) {
                salaryList.add(user);
            }
        }
       return salaryList;
    }
}
