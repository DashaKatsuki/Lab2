package Lec2;

public class ProcessStrings implements StringOperations {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOddPositions(String s) {
        StringBuilder result = new StringBuilder();
        // Берем символы с четными индексами (0, 2, 4...),
        // так как для пользователя это нечетные позиции (1, 3, 5...)
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}