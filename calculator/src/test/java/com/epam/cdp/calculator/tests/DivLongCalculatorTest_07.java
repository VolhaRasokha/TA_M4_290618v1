package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;

public class DivLongCalculatorTest_07 extends CalculatorTestBase {

    @Test(dataProvider = "valuesDivLongCalculatorTest_07")
    public void longOneDivTwoTest(long a, long b, long expectedValue){
        long result = calculator.div(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of div operation for long");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void longOneDivNullTest(){
        calculator.div(8,0);
    }

    @DataProvider(name = "valuesDivLongCalculatorTest_07")
    public Object[][] valuesDivLongCalculatorTest_07(){
        return new Object[][]{
                {8,2,4},
                {0,3,0},
                {9,1,9},
                {1,1,1},
                {21,-3,-7},
                {-45,9,-5},
                {-56,-7,8}
        };
    }
}
