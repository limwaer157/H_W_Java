package Занятия.Lesson_11.Ex001Calc;

public class SumModel extends CalcModel {
        Presenter prt;

    public SumModel() {
    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}
