package org.example;

public class SuperBaton extends Baton {
    /**
     * размер батончика
     */
    private TypeSize size;

    public SuperBaton(String name, double coast, double calories, TypeSize size) {
        super(name, coast, calories);
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format(super.toString()+" size: '%s'",this.size);
    }
}
