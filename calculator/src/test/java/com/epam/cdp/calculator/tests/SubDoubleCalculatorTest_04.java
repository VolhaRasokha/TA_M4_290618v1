package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class SubDoubleCalculatorTest_04 extends CalculatorTestBase {

    private static final double DELTA = 0.001;

    @Test(dataProvider = "valuesSubDoubleCalculatorTest_04")
    public void doubleOneSubTwoTest(double a, double b, double expectedValues){
        double result = calculator.sub(a,b);
        Assert.assertEquals(result, expectedValues, DELTA, "Invalid result of sum operation!");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesSubDoubleCalculatorTest_04")
    public Object[][] valuesSubDoubleCalculatorTest_04(){
        return new Object[][]{
                {0,0,0},
                {3.2,2.1,1.1},
                {2.2,3.8,-1.6},
                {5.6,-4.1,9.7},
                {-6.3,3.2,-9.5},
                {-7.5,-3.3,-4.2},
                {4.1,4.1,0},
                {1.3,0.3,1}
        };
    }

}
