package com.decagon.java.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //hiring a Cashier from applicants
        Applicant john = new Applicant("John Omotoye", "First class");
        Applicant tunde = new Applicant("Tunde Onokoya", "Second class");
        Applicant aproko = new Applicant("Aproko Doctor", "Pass");
        Applicant reno = new Applicant("Reno Omokri", "First class");

        Manager Sizwe = new Manager("Sizwe Bansi");

        Sizwe.hireACashier(tunde);
        Sizwe.hireACashier(john);
        Sizwe.hireACashier(reno);

        System.out.println(Sizwe.hiredCashier);


        //products

        Product milo = new Product("Milo", 200);
        Product peak = new Product("Peak", 300);
        Product rexona = new Product("rexona", 1000);
        Product bread = new Product("bread", 750);

        //customer
        Customer jane = new Customer("jane");
        jane.buyProduct(milo, 2);
        jane.buyProduct(rexona, 1);

        System.out.println(jane.getProductList());




    }
}