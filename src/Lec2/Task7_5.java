package Lec2;

public class Task7_5 {
    public static void main(String[] args) {
        StringOperations ops = new ProcessStrings();
        String testStr = "Программирование";

        System.out.println("=== Работа со строками ===");
        System.out.println("Исходная строка: " + testStr);

        System.out.println("Количество символов: " + ops.countChars(testStr));
        System.out.println("Символы на нечётных позициях: " + ops.getOddPositions(testStr));
        System.out.println("Инвертированная строка: " + ops.reverse(testStr));

        System.out.println("\n--- Дополнительный пример ---");
        String shortStr = "Java";
        System.out.println("Строка: " + shortStr);
        System.out.println("Нечётные позиции: " + ops.getOddPositions(shortStr));
        System.out.println("Инверсия: " + ops.reverse(shortStr));
    }
}