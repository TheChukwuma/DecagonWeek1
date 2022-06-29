package com.decagon.java.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Product milo;
    Customer John;

    @BeforeEach
    void setUp() {
        milo = new Product("Milo", 200);
        John = new Customer("John");
    }

    @Test
    void buyProduct_Test() {

       ArrayList<Product> pro = new ArrayList<>();
       John.buyProduct(milo,200);
       pro.add(milo);

        ArrayList<Product> actual = John.getProductList();

        assertEquals(actual,pro);


    }
}