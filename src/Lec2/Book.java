package Lec2;

import Lec1.BookPr;
import Lec1.Printable;

public class Book extends BookPr {
    public Book(String title, String author) {
        super(title, author);
    }

    // Статический метод, который выводит только книги
    public static void printBooks(Printable[] printable) {
        System.out.println("=== Список книг ===");
        for (Printable item : printable) {
            // Если объект является экземпляром Book (или BookPr)
            if (item instanceof Book) {
                item.print();
            }
        }
    }
}