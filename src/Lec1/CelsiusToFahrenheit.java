package Lec1;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double celsius) {
        // Формула: F = C * 9/5 + 32
        return celsius * 9.0 / 5.0 + 32.0;
    }
}