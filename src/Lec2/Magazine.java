package Lec2;

import Lec1.Printable; // Импортируем интерфейс из пакета Lec1

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: \"" + title + "\"");
    }

    // Статический метод, который выводит только журналы
    public static void printMagazines(Printable[] printable) {
        System.out.println("=== Список журналов ===");
        for (Printable item : printable) {
            // Если объект является экземпляром Magazine (или его подкласса)
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }
}