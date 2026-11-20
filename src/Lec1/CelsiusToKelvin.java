package Lec1;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double celsius) {
        // Формула: K = C + 273.15
        return celsius + 273.15;
    }
}