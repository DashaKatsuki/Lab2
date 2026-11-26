package Lec3;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Task11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        // Отключаем "мягкий" режим (чтобы нельзя было ввести 32.13.2026)
        sdf.setLenient(false);

        System.out.println("=== Сравнение дат ===");
        System.out.print("Введите дату в формате dd.MM.yyyy (например, 15.05.2025): ");
        String input = scanner.nextLine();

        try {
            // 1. Парсим введённую строку в объект Date
            Date userDate = sdf.parse(input);

            // 2. Получаем текущую дату (обнуляем время, чтобы сравнивать только дни)
            Date today = sdf.parse(sdf.format(new Date()));

            // 3. Сравниваем даты с помощью compareTo()
            int result = userDate.compareTo(today);

            if (result > 0) {
                System.out.println("Введённая дата (" + input + ") находится в БУДУЩЕМ.");
            } else if (result < 0) {
                System.out.println("Введённая дата (" + input + ") находится в ПРОШЛОМ.");
            } else {
                System.out.println("Введённая дата (" + input + ") совпадает с СЕГОДНЯШНЕЙ.");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: Вы ввели дату в неверном формате! Попробуйте ещё раз (dd.MM.yyyy).");
        }

        scanner.close();
    }
}