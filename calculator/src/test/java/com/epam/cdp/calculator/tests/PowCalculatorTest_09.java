package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class PowCalculatorTest_09 extends CalculatorTestBase {

    @Test(dataProvider = "valuePowCalculatorTest_09")
    public void onePowTwoTest (double a, double b, double expectedValue){
        double result = calculator.pow(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of pow operation");
    }

    @DataProvider
    public Object[][] valuePowCalculatorTest_09(){
        return new Object[][] {
                {3,2,9},
                {0.04,0.5,0.2},
                {8,1,8},
                {8.9,0,1},
                {0,7,0},
                {4,0.5,2},
                {4,-0.5,0.5},
                {4,-2,0.0625}
        };
    }
}
