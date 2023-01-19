package org.example;

public class Bread extends Baton{
    /**
     * вид хлеба
     */
    private String loaf;
    public Bread(String name, double coast, double calories, String loaf) {
        super(name, coast, calories);
        this.loaf=loaf;
    }

    public String getLoaf() {
        return loaf;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " loaf= '%s'", loaf);
    }
}
