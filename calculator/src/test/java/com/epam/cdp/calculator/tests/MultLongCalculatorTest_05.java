package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class MultLongCalculatorTest_05 extends CalculatorTestBase {

    @Test(dataProvider = "valuesMultLongCalculatorTest_05")
    public void longOneMultTwoTest(long a, long b, long expectedValue){
        long result = calculator.mult(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesMultLongCalculatorTest_05")
    public Object[][] valuesMultLongCalculatorTest_05(){
        return new Object[][]{
                {0,0,0},
                {0,2,0},
                {4,0,0},
                {5,1,5},
                {1,6,6},
                {15,25,375},
                {2,-3,-6},
                {-2,3,-6},
                {-2,-3,6}
        };
    }
}
