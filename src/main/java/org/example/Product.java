package org.example;

public class Product {
    /**
     * название продукта
     */
    private String name;
    /**
     * цена продукта
     */
    private double coast;

    public Product(String name, double coast) {
        this.coast = coast;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return String.format("Product name= '%s' coast= '%.2f'",this.name , this.coast);
    }
}

