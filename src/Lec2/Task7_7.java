package Lec2;

import Lec1.Printable;
import Lec1.Shop;

public class Task7_7 {
    public static void main(String[] args) {
        // Создаём объекты разных типов
        Book book1 = new Book("Война и мир", "Л.Н. Толстой");
        Book book2 = new Book("Преступление и наказание", "Ф.М. Достоевский");
        Magazine mag1 = new Magazine("Хакер");
        Magazine mag2 = new Magazine("National Geographic");
        Shop shop = new Shop("DNS", "ул. Ленина, 10");

        // Складываем всё в один массив Printable
        Printable[] items = {book1, book2, mag1, mag2, shop};

        // Вызываем статические методы, которые фильтруют по instanceof
        Book.printBooks(items);
        System.out.println(); // Пустая строка для красоты
        Magazine.printMagazines(items);
    }
}
