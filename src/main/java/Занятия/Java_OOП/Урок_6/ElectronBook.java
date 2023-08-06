package Занятия.Java_OOП.Урок_6;

public class ElectronBook extends Book{

    private String format;
    private Integer size;

    public ElectronBook(String name, String author, int age, String format, Integer size) {
        super(name, author, age);
        this.format = format;
        this.size = size;
    }

    public ElectronBook(String format, Integer size) {
        this.format = format;
        this.size = size;
    }

    public ElectronBook(String name, String author, int age) {
        super(name, author, age);
    }

    public ElectronBook() {
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
