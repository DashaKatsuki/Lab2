package Lec1;

public class TV implements Priceable {
    private String brand;
    private int diagonal;
    private double price;

    public TV(String brand, int diagonal, double price) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" + brand + ", " + diagonal + "\", цена=" + price + " руб.}";
    }
}