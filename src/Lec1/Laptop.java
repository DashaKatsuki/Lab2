package Lec1;

public class Laptop implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" + brand + " " + model + ", цена=" + price + " руб.}";
    }
}