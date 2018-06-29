package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class SinCalaculatorTest_14 extends CalculatorTestBase {
    private static final double DELTA = 0.001;

    @Test(dataProvider = "valuesSinCalculatorTest_14", groups = {"trigCalculatorTest"})
    public void sinOneTest(double a, double expectedValue){
        double result = calculator.sin(a);
        Assert.assertEquals(result,expectedValue, DELTA, "Invalid result of sin operation");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesSinCalculatorTest_14")
    public Object[][] valuesSinCalculatorTest_14(){
        return new Object[][]{
                {0, 0},
                {(Math.PI)/6, 0.5},
                {(Math.PI)/2, 1},
                {Math.PI, 0},
                {((Math.PI)*3)/2,-1},
                {Math.PI, 0}
        };
    }
}
