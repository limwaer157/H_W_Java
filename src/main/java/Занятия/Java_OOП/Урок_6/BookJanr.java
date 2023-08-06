package Занятия.Java_OOП.Урок_6;

public class BookJanr implements Genre{

    String genre;

    public BookJanr(String genre) {
        this.genre = genre;
    }

    @Override
    public String getJanrName() {
        return genre;
    }

    @Override
    public String toString() {
        return "BookJanr{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
