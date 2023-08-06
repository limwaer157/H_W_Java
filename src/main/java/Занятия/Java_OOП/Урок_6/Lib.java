package Занятия.Java_OOП.Урок_6;

import java.util.ArrayList;
import java.util.List;

public  class Lib implements Searchable {

    List<Book> books = new ArrayList<>();

    public Lib(List<Book> books) {
        this.books = books;
    }

    public Lib() {
    }

    @Override
    public List<Book> searchable(String authorName) {
        List<Book> resBook = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(authorName)){
                resBook.add(book);
            }
        }
        return resBook;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Lib{" +
                "books=" + books +
                '}';
    }
}
