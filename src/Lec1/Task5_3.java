package Lec1;

public class Task5_3 {
    public static void main(String[] args) {
        // Создаём объекты разных классов
        Planet earth = new Planet("Earth", 5.97e24);
        Car dodj = new Car("Challenger", "X5", 2023);
        Animal dog = new Animal("Собака", "Шарик");

        // полиморфизма: массив типа Nameable
        Nameable[] objects = {earth, dodj, dog};

        System.out.println("Все объекты через интерфейс Nameable");
        for (Nameable obj : objects) {
            // Мы не знаем точный тип объекта, но знаем, что у него есть getName()
            System.out.println("Имя: " + obj.getName());
            System.out.println("  toString: " + obj);
            System.out.println();
        }

        // Дополнительно: если нужно — можно «привести» тип и вызвать специфичные методы
        System.out.println("Дополнительные детали");
        System.out.println("Масса Земли: " + earth.getMass());
        System.out.println("Год выпуска Chellenger: " + dodj.getYear());
        System.out.println("Вид животного: " + dog.getSpecies());
    }
}