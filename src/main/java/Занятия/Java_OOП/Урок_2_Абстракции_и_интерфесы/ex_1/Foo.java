package Занятия.Java_OOП.Урок_2_Абстракции_и_интерфесы.ex_1;

public class Foo {
    private Integer value;
    protected static Integer count ;
    static {
        count =0;
    }
    public Foo(){
         count++ ;
    }
    public  Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
