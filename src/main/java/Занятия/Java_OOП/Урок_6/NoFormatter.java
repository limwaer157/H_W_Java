package Занятия.Java_OOП.Урок_6;

import java.util.List;

public class NoFormatter implements Formatter {
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book " + book.getName() + " переведена в формат " + Formats.NOFORMAT);
        }
    }
}
