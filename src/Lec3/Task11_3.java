package Lec3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Task11_3 {
    public static void main(String[] args) throws ParseException {
        // Создаём дату рождения (например, 15 мая 2004 года)
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date birth = sdf.parse("15.05.2004");

        // Создаём студента
        Student student = new Student("Пономарева Дарья", birth);

        System.out.println("Информация о студенте");

        // 1. Выводим через toString (формат по умолчанию)
        System.out.println("toString: " + student);

        // 2. Вызываем getBirthDate с разными форматами
        System.out.println("\n Дата рождения в разных форматах");
        System.out.println("Короткий (dd.MM.yyyy):  " + student.getBirthDate("dd.MM.yyyy"));
        System.out.println("Средний (dd MMM yyyy):  " + student.getBirthDate("dd MMM yyyy"));
        System.out.println("Полный (dd MMMM yyyy):  " + student.getBirthDate("dd MMMM yyyy"));
        System.out.println("Английский (EEEE, MMM d, yyyy): " + student.getBirthDate("EEEE, MMM d, yyyy"));
    }
}