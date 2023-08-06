package Занятия.Обработка_ошибок.Seminar_3.Task_2;

public class MyArraySizeException extends IllegalArgumentException{
    public MyArraySizeException(String s) {
        super(s);
    }
}
