package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class CtgCalculatorTest_12 extends CalculatorTestBase {

    @Test(dataProvider = "valuesCtgCalculatorTest_12", groups = {"trigCalculatorTest"})
    public void ctgOneTest(double a, double expectedValue){
        double result = calculator.ctg(a);
        Assert.assertEquals(result,expectedValue,"Invalid result of ctg operation");
        checkTime();
        Timeout.sleep(2);
    }

    @Test (groups = {"trigCalculatorTest"})
    public void ctgNanResultTest(){
        boolean result = Double.isNaN(calculator.ctg(Math.PI));
        Assert.assertTrue(result, "Invalid result of tg operation for PI (Pass if value is NaN)");
        checkTime();
        Timeout.sleep(2);
    }

    @Test (groups = {"trigCalculatorTest"})
    public void ctgNullTest(){
        boolean result = Double.isNaN(calculator.ctg(0));
        Assert.assertTrue(result,"Invalid result of tg operation for 0 (Pass if value is NaN)");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesCtgCalculatorTest_12")
    public Object[][] valuesCtgCalculatorTest_12(){
        return new Object[][]{
                {Math.PI/4, 1},
                {Math.PI/2, 0},
                {(Math.PI*3)/4, -1},
                {-(Math.PI*3)/4,1},
        };
    }
}
