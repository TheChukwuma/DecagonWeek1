package com.decagon.java.task1;

import java.util.ArrayList;

public class Manager extends Person {
    ArrayList<Applicant> hiredCashier = new ArrayList<>();
    public Manager(String name) {
        super(name);

    }

    public void hireACashier(Applicant applicant){
        if (applicant.getDegree() == "First class"){
            hiredCashier.add(applicant);
            System.out.printf("Dear %s, congratulations you are employed.\n", applicant.getName());
        }
        else {
            System.out.printf("Dear %s, Although you are good you do not meet our criteria.\n", applicant.getName());
        }

    }

    @Override
    public String toString() {
        return "Manager{" +
                "hiredCashier=" + hiredCashier +
                '}';
    }
}

