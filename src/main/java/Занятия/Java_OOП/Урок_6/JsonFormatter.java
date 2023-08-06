package Занятия.Java_OOП.Урок_6;

import java.util.List;

public class JsonFormatter implements Formatter{
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book " + book.getName() + " переведена в формат " + Formats.JSON);
        }
    }
}
