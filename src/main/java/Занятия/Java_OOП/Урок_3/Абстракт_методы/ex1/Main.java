package Занятия.Java_OOП.Урок_3.Абстракт_методы.ex1;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m() {
                System.out.println("1");
            }

            @Override
            public void m2() {
                System.out.println("2");
            }

            @Override
            public void m3() {
                System.out.println("3");
            }
        };
        foo.m2();
    }
}
