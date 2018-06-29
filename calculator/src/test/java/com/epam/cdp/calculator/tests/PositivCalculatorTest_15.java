package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class PositivCalculatorTest_15 extends CalculatorTestBase {

    @Test(dataProvider = "valueIsPositivCalculatorTest_15")
    public void IsPositivCalculatorTest_15(long a, boolean expectedValue){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of IsPositiv operation");
    }

    @DataProvider(name = "valueIsPositivCalculatorTest_15")
    public Object[][] valueIsPositivCalculatorTest_15(){
        return new Object[][]{
                {0, false},
                {1, true},
                {-1, false},
                {-(-1),true}
        };
    }
}
