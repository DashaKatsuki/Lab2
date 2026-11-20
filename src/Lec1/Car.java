package Lec1;

public class Car implements Nameable {//н
    private String brand;//и
    private String model;//и
    private int year;//и

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getName() {
        return brand + " " + model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{name='" + getName() + "', year=" + year + "}";
    }
}