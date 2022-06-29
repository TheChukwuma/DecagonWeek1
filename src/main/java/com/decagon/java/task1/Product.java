package com.decagon.java.task1;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    //private ArrayList<String> productsBought;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }



    @Override
    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                '}';
       return this.name;
    }
}
