package org.example.Home_work_Java_Exep.Seminar_3.Service;

import org.example.Home_work_Java_Exep.Seminar_3.Exceptions.NeedMoreDataExceptions;

import java.util.Scanner;

//Приложение должно проверить введенные данные по количеству.
// Если количество не совпадает с требуемым, вернуть код ошибки. Создать метод,
// который обработает его и покажет пользователю сообщение, что он ввел меньше или больше данных, чем требуется.
//
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
// Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано,
// пользователю выведено сообщение с информацией, что именно неверно.
//
public interface ServisePerson {

    String askAllData();

    void showErrorNoData(int errorNumber) throws NeedMoreDataExceptions;

}
