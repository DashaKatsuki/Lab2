package Lec1;

public class Task5_4 {
    public static void main(String[] args) {
        // Создаём объекты разных классов
        Laptop laptop = new Laptop("ASUS", "VivoBook", 65000);
        Book book = new Book("Война и мир", "Л.Н. Толстой", 1500);
        TV tv = new TV("Samsung", 55, 80000);

        // Полиморфизм: массив типа Priceable
        Priceable[] items = {laptop, book, tv};

        System.out.println("Все объекты через интерфейс Priceable");
        double total = 0;

        for (Priceable item : items) {
            // Выводим описание объекта (через toString)
            System.out.println(item);
            // Выводим цену (через метод интерфейса)
            System.out.println("  Цена: " + item.getPrice() + " руб.");
            // Считаем общую сумму
            total += item.getPrice();
            System.out.println();
        }

        System.out.println("Общая стоимость всех товаров: " + total + " руб.");
    }
}