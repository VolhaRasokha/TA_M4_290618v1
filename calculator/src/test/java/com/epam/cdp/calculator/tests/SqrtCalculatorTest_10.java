package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class SqrtCalculatorTest_10 extends CalculatorTestBase {

    @Test(dataProvider = "valuesSqrtCalculatorTest_10")
    public void sqrtOneTest(double a, double expectedValue){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result,expectedValue, "Invalid result of sqrt operation");
    }

    @Test
    public void sqrtNegativeTest(){
        boolean result = Double.isNaN(calculator.sqrt(-4));
        Assert.assertTrue(result, "Invalid result of sqrt operation");
    }

    @DataProvider(name = "valuesSqrtCalculatorTest_10")
    public Object[][] valuesSqrtCalculatorTest_10(){
        return new Object[][]{
                {1,1},
                {0,0},
                {4,2},
                {2.25,1.5}
        };
    }

}
