package Lec3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String fullName;
    private Date birthDate; // Дата рождения

    public Student(String fullName, Date birthDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    // Геттер для ФИО
    public String getFullName() {
        return fullName;
    }

    // Метод, возвращающий дату рождения в заданном формате
    public String getBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    // Переопределённый toString — по умолчанию формат dd.MM.yyyy
    @Override
    public String toString() {
        return "Студент: " + fullName + ", дата рождения: " + getBirthDate("dd.MM.yyyy");
    }
}