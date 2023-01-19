package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCoast(double coast) {
        for (Product product : productList) {
            if (product.getCoast() == coast) {
                return product;
            }
        }
        return null;
    }

    public VendingMachine() {
        this.productList = new ArrayList<Product>();
    }
}
