package Занятия.Java_OOП.Урок_5.Service;

import Занятия.Java_OOП.Урок_5.Model.AbstractUser;
import Занятия.Java_OOП.Урок_5.Model.Type;

import java.util.List;

public  interface DataService {

    public void userCreate(String name, String lastName, int valuation, int classNumber,Type type);
    List<AbstractUser> read();

    List<AbstractUser> readOnlyStudents();

    List<AbstractUser> readOnlyTeacher();
}
