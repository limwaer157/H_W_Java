package Занятия.Обработка_ошибок.Seminar_3.Task_1;

// TODO: 04.08.2023  1. Создайте класс исключения, который будет выбрасываться при делении на 0.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.
//2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве
//ссылочного типа. Исключение должно отображать понятное для пользователя сообщение об ошибке
//3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
//Исключение должно отображать понятное для пользователя сообщение об ошибке.
public class Main {
    public static void main(String[] args) {
        try {
        System.out.println(division(5, 0));
        }
        catch (DevisionByZeroException  e){
            e.printStackTrace();
        }
    }

    static double division(int a,int b){
        if(b == 0){
            throw new DevisionByZeroException("You can't  divide by zero ");
        }
        return a/b;
    }
}
