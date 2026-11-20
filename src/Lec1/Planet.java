package Lec1;

public class Planet implements Nameable {//н
    private String name;//и
    private double mass;//и

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Planet{name='" + name + "', mass=" + mass + "}";
    }
}