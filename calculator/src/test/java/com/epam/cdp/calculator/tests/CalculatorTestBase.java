package com.epam.cdp.calculator.tests;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class CalculatorTestBase {
    protected Calculator calculator;

    @BeforeClass (groups = {"trigCalculatorTest"})
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterClass (groups = {"trigCalculatorTest"})
    public void tearDown(){
        calculator = null;
    }

    protected void checkTime(){
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
        System.out.println("");
    }
}
