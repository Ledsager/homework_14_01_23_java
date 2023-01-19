package org.example;

public class Baton extends Product {
    /**
     * количество калорий в продукте
     */
    private Double calories;

    public Baton(String name, double coast, double calories) {
        super(name, coast);
        this.calories = calories;

    }

    @Override
    public String toString() {
        return String.format(super.toString() + " calories: '%.2f'", this.calories);
    }

    public Double getCalories() {
        return calories;
    }
}
