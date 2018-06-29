package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class CosCalculatorTest_13 extends CalculatorTestBase {
    private static final double DELTA = 0.001;

    @Test(dataProvider = "valuesCosCalculatorTest_13", groups = {"trigCalculatorTest"})
    public void cosOneTest(double a, double expectedValue){
        double result = calculator.cos(a);
        Assert.assertEquals(result,expectedValue, DELTA,"Invalid result of cos operation");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesCosCalculatorTest_13")
    public Object[][] valuesCosCalculatorTest_11(){
        return new Object[][]{
                {0, 1},
                {Math.PI/3, 0.5},
                {Math.PI/2, 0},
                {Math.PI, -1},
                {Math.PI*3/2,0},
                {Math.PI*2,1}
        };
    }
}
