package Lec1;

public class Animal implements Nameable {//н
    private String species; //и вид (собака, кошка...)
    private String name;    //и кличка

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "', name='" + name + "'}";
    }
}
