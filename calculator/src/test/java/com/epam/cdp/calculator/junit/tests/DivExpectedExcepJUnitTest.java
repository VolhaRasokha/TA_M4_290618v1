package com.epam.cdp.calculator.junit.tests;

import org.junit.Before;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class DivExpectedExcepJUnitTest {

    private Calculator calculator;

    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @Test(expected = NumberFormatException.class)
    public void divDoubleJUnitExcepTest_07() {
        calculator.div(1.5, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void divLongJUnitExcepTest_07() {
        calculator.div(1, 0);
    }


}
