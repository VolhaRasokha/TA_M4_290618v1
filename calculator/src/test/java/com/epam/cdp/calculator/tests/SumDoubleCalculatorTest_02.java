package com.epam.cdp.calculator.tests;

import org.testng.Assert;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest_02 extends CalculatorTestBase {

    private static final double DELTA = 0.001;

    @Test(dataProvider = "valuesSumDoubleCalculatorTest_02")
    public void doubleOnePlusTwoTest(double a, double b, double expectedValue){
        double result = calculator.sum(a,b);
        Assert.assertEquals(result, expectedValue, DELTA,"Invalid result of sum operation!");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesSumDoubleCalculatorTest_02")
    public Object[][] valuesSumDoubleCalculatorTest_02(){
        return new Object[][]{
                {1.5,0.6,2.1},
                {3.9,-1.3,2.6},
                {0,0,0},
                {-1.3,1.2,-0.1},
                {-1.2,-7.3,-8.5},
                {1.1,-1.1,0},
                {3.7,1.3,5}
        };
    }

}