package org.example;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("капуста", 10));
        vendingMachine.getProductList().add(new Product("морковь", 25));
        vendingMachine.getProductList().add(new Product("свекла", 15));
        vendingMachine.getProductList().add(new Milk("молоко", 5, "ООО Коровка"));
        vendingMachine.getProductList().add(new Baton("батончик марс", 17, 45));
        vendingMachine.getProductList().add(new Bread("хлеб", 17, 21, "ржаной"));
        vendingMachine.getProductList().add(new SuperBaton("супербатончик марс", 23, 90, TypeSize.Big));

        for (Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
        System.out.println("-----------------");
        for (Product product : vendingMachine.getProductList()) {
            if (product.getName().contains("о")) {
                System.out.println(product);
            }
        }
    }
}