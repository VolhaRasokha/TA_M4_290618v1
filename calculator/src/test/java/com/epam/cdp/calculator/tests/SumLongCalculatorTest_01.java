package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class SumLongCalculatorTest_01 extends CalculatorTestBase {

    @Test(dataProvider = "valuesSumLongCalculatorTest_01")
    public void longOnePlusTwoTest(long a, long b, long expextedValue){
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expextedValue, "Invalid result of sum operation!");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesSumLongCalculatorTest_01")
    public Object[][] valuesSumLongCalculatorTest_01(){
        return new Object[][]{
                {10,25,35},
                {11,-2,9},
                {0,0,0},
                {-1,30,29},
                {-5,-7,-12},
                {2,-2,0},
                {3,3,6}
        };
    }

}
