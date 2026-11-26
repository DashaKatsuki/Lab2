package Lec1;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuilder {
    // Внутри используем стандартный StringBuilder для хранения текста
    private StringBuilder text = new StringBuilder();

    // Список для хранения истории. Мы будем сохранять длину строки ДО добавления
    private List<Integer> history = new ArrayList<>();

    // Метод добавления текста (аналог append)
    public MyStringBuilder append(String str) {
        // 1. Запоминаем текущую длину перед изменением
        history.add(text.length());
        // 2. Добавляем текст
        text.append(str);
        return this; // Возвращаем себя, чтобы можно было делать цепочки (как в обычном StringBuilder)
    }

    // Метод отмены последнего действия
    public void undo() {
        if (history.isEmpty()) {
            System.out.println("Нечего отменять!");
            return;
        }

        // 1. Достаем длину, которая была ДО последнего добавления
        // (удаляем её из истории, чтобы нельзя было отменить дважды одно и то же)
        int previousLength = history.remove(history.size() - 1);

        // 2. Обрезаем строку до этой длины
        text.setLength(previousLength);
    }

    // Возвращает текущую строку
    @Override
    public String toString() {
        return text.toString();
    }
}
