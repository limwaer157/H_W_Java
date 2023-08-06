package Занятия.Обработка_ошибок.Seminar_3.Task_1;

public class DevisionByZeroException extends ArithmeticException {
    public DevisionByZeroException(String s) {
        super(s);
    }
}
