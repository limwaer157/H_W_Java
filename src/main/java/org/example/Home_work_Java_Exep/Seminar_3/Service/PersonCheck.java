package org.example.Home_work_Java_Exep.Seminar_3.Service;

import org.example.Home_work_Java_Exep.Seminar_3.Model.Person;

import java.util.Arrays;

public class PersonCheck implements CheckInPerson {
    WorkWithPerson workWithPerson = new WorkWithPerson();
    Person person = new Person();

    @Override
    public void chekInFile(String startWord) {
        String[] workWord = startWord.split(" ");
        if (workWord.length == 6) {
//                System.out.print(Arrays.toString(workWord) + " ");
            String lastName = workWord[0];
            workWithPerson.save.saveAsFile(workWord, lastName);
        } else if (workWord.length > 6) {
            workWithPerson.showErrorNoData(2);
        } else {
            workWithPerson.showErrorNoData(1);
        }
    }
}

