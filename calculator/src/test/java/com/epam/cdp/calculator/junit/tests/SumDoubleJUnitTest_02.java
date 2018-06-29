package com.epam.cdp.calculator.junit.tests;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import com.epam.tat.module4.Calculator;

@RunWith(value = Parameterized.class)
public class SumDoubleJUnitTest_02 {
    private Calculator calculator;

    @Before
    public  void initialize(){
        calculator = new Calculator();
    }

    @Parameter(value = 0)
    public double a;

    @Parameter(value = 1)
    public double b;

    @Parameter(value = 2)
    public double expectedValue;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1.5,0.6,2.1},
                {3.9,-1.3,2.6},
                {0,0,0},
                {-1.3,1.2,-0.1},
                {-1.2,-7.3,-8.5},
                {1.1,-1.1,0},
                {3.7,1.3,5}
        });
    }

    @Test
    public void sumDoubleJUnitTest_02(){
        assertEquals(expectedValue,calculator.sum(a,b),0.0001);
    }
}
