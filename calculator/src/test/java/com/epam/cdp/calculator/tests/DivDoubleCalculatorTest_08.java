package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class DivDoubleCalculatorTest_08 extends CalculatorTestBase {

    @Test(dataProvider = "valueDivDoubleCalculatorTest_08")
    public void doubleOneDivTwoTest(double a, double b, double expectedValue){
        double result = calculator.div(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of div operation for double");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void doubleOneDivNullTestException(){
        calculator.div(4.5,0);
    }

    @DataProvider(name = "valueDivDoubleCalculatorTest_08")
    public Object[][] valueDivDoubleCalculatorTest_08(){
        return new Object[][]{
                {2.25,1.5,1.5},
                {2.02,1.01,2},
                {5.6,1,5.6},
                {-2.25,1.5,-1.5},
                {2.25,-1.5,-1.5},
                {-2.25,-1.5,1.5},
                {0,2.4,0}
        };
    }
}
