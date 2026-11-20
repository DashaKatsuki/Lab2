package Lec1;

public class BookPr implements Printable {
    private String title;
    private String author;

    public BookPr(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: \"" + title + "\" — автор: " + author);
    }
}