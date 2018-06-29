package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class NegativeCalculatorTest_16 extends CalculatorTestBase {

    @Test(dataProvider = "valueIsNegativeCalculatorTest_16")
    public void isNegativeCalculatorTest_16(long a, boolean expectedValue){
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of isNegative operation");
    }

    @DataProvider(name = "valueIsNegativeCalculatorTest_16")
    public Object[][] valueIsNegativeCalculatorTest_16(){
        return new Object[][]{
                {0, false},
                {1, false},
                {-1, true},
                {-(-1),false}
        };
    }
}
