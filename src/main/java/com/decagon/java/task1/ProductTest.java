package com.decagon.java.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    Manager first = new Manager("John");

    Applicant goodApp = new Applicant("Jamiu", "First class");
    Applicant badApp = new Applicant("Badman", "pass");

    @Test
    void hiredApplicantTest_testGoodCashier(){
        String actual = first.hireACashier(goodApp);
        assertEquals(goodApp, actual);

    }
    @Test
    void hiredApplicantTest_testBadCashier(){
        String actual = first.hireACashier(badApp);
        assertEquals(badApp, actual);

    }




}