package Занятия.Java_OOП.Урок_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lib lib = new Lib(Arrays.asList(
                new Book("qwe","qwe1",12,new BookJanr("zaq")),
                new Book("qwe2","qwe2",100,new BookJanr("qwe2"))));
        System.out.println("lib.searchable(\"zaq\") = " + lib.searchable("qwe1"));

    }
}

