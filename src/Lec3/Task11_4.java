package Lec3;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println("Создание даты из ввода пользователя");

        System.out.print("Введите год (например, 2024): ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minute = scanner.nextInt();

        // --- Способ 1: через Calendar ---
        // ВАЖНО: в Calendar месяц считается с 0 (январь = 0), поэтому month - 1
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);

        Date dateFromCalendar = cal.getTime();

        // --- Способ 2: через String ---
        String dateString = String.format("%02d.%02d.%d %02d:%02d", day, month, year, hour, minute);
        Date dateFromString = null;
        try {
            dateFromString = sdf.parse(dateString);
        } catch (Exception e) {
            System.out.println("Ошибка парсинга");
        }

        // --- Вывод ---
        System.out.println("\n=== Результаты ===");
        System.out.println("Строка, которую собрали:  " + dateString);
        System.out.println("Дата из Calendar:         " + sdf.format(dateFromCalendar));
        System.out.println("Дата из SimpleDateFormat: " + sdf.format(dateFromString));

        scanner.close();
    }
}