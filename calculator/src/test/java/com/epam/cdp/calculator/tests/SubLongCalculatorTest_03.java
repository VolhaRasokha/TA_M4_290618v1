package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class SubLongCalculatorTest_03 extends CalculatorTestBase {

    @Test(dataProvider = "valuesSubLongCalculatorTest_03")
    public void longOneSubTwoTest(long a, long b, long expectedValues){
        long result = calculator.sub(a,b);
        Assert.assertEquals(result, expectedValues, "Invalid result of sum operation!");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesSubLongCalculatorTest_03")
    public Object[][] valuesSubLongCalculatorTest_03(){
        return new Object[][]{
                {0,0,0},
                {3,2,1},
                {3,4,-1},
                {5,-4,9},
                {-6,3,-9},
                {-7,-3,-4},
                {4,4,0}
        };
    }


}
