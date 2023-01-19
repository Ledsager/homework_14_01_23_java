package org.example;

public class Milk extends Product {
    /**
     * производитель молока
     */
    private String manufacture;

    public Milk(String name, double coast, String manufacture) {
        super(name, coast);
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " manufacture= '%s'", manufacture);
    }
}
