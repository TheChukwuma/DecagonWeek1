package com.decagon.java.task1;

import java.util.ArrayList;

public class Customer extends Person {
    private ArrayList<Product> productList;
    public Customer(String name) {
        super(name);
        productList = new ArrayList<>();
    }

    public void buyProduct(Product product, int quantity){
        productList.add(product);
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
