package Lec3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task11_1 {
    public static void main(String[] args) {
        // 1. Получаем текущую дату и время (дата получения задания)
        Date startDate = new Date();

        // 2. Имитируем, что мы сдаём задание через некоторое время
        // (в реальной жизни это было бы просто new Date() в момент сдачи)
        // Для наглядности создадим дату сдачи через 3 дня от текущей
        Date endDate = new Date(startDate.getTime() + 3L * 24 * 60 * 60 * 1000); // + 3 дня

        // 3. Форматируем даты для красивого вывода
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM yyyy, HH:mm:ss");

        System.out.println("Информация о задании");
        System.out.println("Студент: Пономарева Дарья"); // Впишите свои ФИО
        System.out.println("Дата получения: " + sdf.format(startDate));
        System.out.println("Дата сдачи: " + sdf.format(endDate));

        // 4. Демонстрация разных форматов
        System.out.println("\n Разные форматы даты сдачи");
        System.out.println("Короткий: " + new SimpleDateFormat("dd.MM.yyyy").format(endDate));
        System.out.println("Средний:  " + new SimpleDateFormat("dd.MM.yyyy HH:mm").format(endDate));
        System.out.println("Полный:   " + new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss").format(endDate));
    }
}