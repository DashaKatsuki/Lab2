package Lec1;

public class Task5_11 {
    public static void main(String[] args) {
        double celsius = 25.0; // Температура для перевода

        // Создаём объекты конвертеров
        Convertable toKelvin = new CelsiusToKelvin();
        Convertable toFahrenheit = new CelsiusToFahrenheit();

        System.out.println("SКонвертация температуры");
        System.out.println("Исходная температура: " + celsius + "°C");
        System.out.println();

        // Вызываем один и тот же метод convert() у разных объектов
        System.out.println("В Кельвинах: " + toKelvin.convert(celsius) + " K");
        System.out.println("В Фаренгейтах: " + toFahrenheit.convert(celsius) + " °F");
    }
}