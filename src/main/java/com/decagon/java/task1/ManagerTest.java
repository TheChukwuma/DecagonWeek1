package com.decagon.java.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager first = new Manager("John");

    Applicant goodApp = new Applicant("Jami", "First class");
    Applicant badApp = new Applicant("Badman", "pass");
    Product milo;

    @BeforeEach
    void setUp() {
         milo = new Product("Milo", 200);
    }

//    @Test
//    void hireACashier() {
//    }
    @Test
    void hiredApplicantTest_testGoodCashier(){
    String actual = first.hireACashier(goodApp);
    assertEquals(goodApp,actual);

}
    @Test
    void hiredApplicantTest_testBadCashier(){
        String actual = first.hireACashier(badApp);
        assertEquals(badApp, actual);

    }

}
