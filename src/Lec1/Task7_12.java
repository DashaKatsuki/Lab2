package Lec1;

public class Task7_12 {
    public static void main(String[] args) {
        MyStringBuilder myStr = new MyStringBuilder();

        System.out.println("Тестирование StringBuilder с Undo");

        // 1. Добавляем текст
        myStr.append("Привет, ");
        System.out.println("Текст: " + myStr);

        myStr.append("мир! ");
        System.out.println("Текст: " + myStr);

        myStr.append("Это Java.");
        System.out.println("Текст: " + myStr);

        System.out.println("\n Вызываем Undo ");

        // 2. Отменяем последнее действие
        myStr.undo();
        System.out.println("После 1-го undo: " + myStr);

        // 3. Отменяем ещё одно действие
        myStr.undo();
        System.out.println("После 2-го undo: " + myStr);

        // 4. Отменяем ещё одно действие (должны вернуться к пустой строке)
        myStr.undo();
        System.out.println("После 3-го undo: '" + myStr + "'");

        // 5. Пытаемся отменить то, чего нет
        myStr.undo();
    }
}