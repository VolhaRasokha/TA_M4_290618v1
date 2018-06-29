package com.epam.cdp.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.cdp.calculator.tests.CalculatorTestBase;
import com.epam.tat.module4.Timeout;

public class TgCalculatorTest_11 extends CalculatorTestBase {

    @Test(dataProvider = "valuesTgCalculatorTest_11", groups = {"trigCalculatorTest"})
    public void tgOneTest(double a, double expectedValue){
        double result = calculator.tg(a);
        Assert.assertEquals(result,expectedValue,"Invalid result of tg operation");
        checkTime();
        Timeout.sleep(2);
    }

    @Test(groups = {"trigCalculatorTest"})
    public void tgNanResultTest(){
        boolean result = Double.isNaN(calculator.tg(Math.PI/2));
        Assert.assertTrue(result, "Invalid result of tg operation for PI/2 (Pass if value is NaN)");
        checkTime();
        Timeout.sleep(2);
    }

    @DataProvider(name = "valuesTgCalculatorTest_11")
    public Object[][] valuesTgCalculatorTest_11(){
        return new Object[][]{
                {Math.PI/4, 1},
                {(Math.PI*3)/4, -1},
                {-(Math.PI*3)/4,1},
                {0,0},
                {Math.PI,0},
                {2*Math.PI,0},
        };
    }
}
