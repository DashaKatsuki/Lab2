package Lec1;

public class Book implements Priceable {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{'" + title + "' (" + author + "), цена=" + price + " руб.}";
    }
}