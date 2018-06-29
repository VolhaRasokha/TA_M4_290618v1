package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class MultDoubleCalculatorTest_06 extends CalculatorTestBase {

    private static final double DELTA = 0.0001;

    @Test(dataProvider = "valuesMultDoubleCalculatorTest_06")
    public void doubleOneMultTwoTest(double a, double b, double expectedValues){
        double result = calculator.mult(a,b);
        Assert.assertEquals(result, expectedValues, DELTA,"Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesMultDoubleCalculatorTest_06")
    public Object[][] valuesMultDoubleCalculatorTest_06(){
        return new Object[][]{
                {0,0,0},
                {3.1,2.6,8.06},
                {3.5,-4.3,-15.05},
                {-5.2,4.8,-24.6},
                {-6.7,-3.9,26.13},
                {-7.1,0,0},
                {0,4.3,0},
                {5.8,1,5.8}

        };
    }
}
