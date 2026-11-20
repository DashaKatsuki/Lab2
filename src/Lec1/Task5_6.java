package Lec1;

public class Task5_6 {
    public static void main(String[] args) {
        // Создаём книги
        BookPr book1 = new BookPr("Война и мир", "Л.Н. Толстой");
        BookPr book2 = new BookPr("Преступление и наказание", "Ф.М. Достоевский");

        // Создаём магазины
        Shop shop1 = new Shop("DNS", "ул. Ленина, 10");
        Shop shop2 = new Shop("М.Видео", "пр. Мира, 25");

        // Массив типа Printable — сюда можно положить И книги, И магазины
        Printable[] items = {book1, book2, shop1, shop2};

        System.out.println("=== Все объекты через интерфейс Printable ===");
        for (Printable item : items) {
            // Вызываем print() — Java сама поймёт, чей это метод
            item.print();
        }
    }
}