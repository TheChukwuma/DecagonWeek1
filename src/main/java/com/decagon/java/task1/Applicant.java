package com.decagon.java.task1;

public class Applicant extends Person{
    private String degree;
    public Applicant(String name, String degree) {
        super(name);
        this.degree = degree;

    }

    public String getDegree() {
        return this.degree;
    }



}
