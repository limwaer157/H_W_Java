package Занятия.Java_OOП.Урок_2_Абстракции_и_интерфесы.ex_1;

public class Main {
    public static void main(String[] args) {
        Foo foo1= new Foo();
        foo1.setValue(5);
        System.out.println(foo1);
        System.out.println("Foo.count = " + Foo.count);

        Foo foo2= new Foo();
        foo2.setValue(10);
        System.out.println("foo2 = " + foo2);


        Foo foo3= new Foo();
        foo3.setValue(15);
        System.out.println("Foo.count = " + Foo.count); 

    }
}
