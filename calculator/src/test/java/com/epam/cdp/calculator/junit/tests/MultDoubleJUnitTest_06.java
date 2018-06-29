package com.epam.cdp.calculator.junit.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.epam.tat.module4.Calculator;

@RunWith(value = Parameterized.class)
public class MultDoubleJUnitTest_06 {
    private Calculator calculator;

    @Before
    public  void initialize(){
        calculator = new Calculator();
    }

    @Parameterized.Parameter(value = 0)
    public double a;

    @Parameterized.Parameter(value = 1)
    public double b;

    @Parameterized.Parameter(value = 2)
    public double expectedValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {3.1,2.6,8.06},
                {3.5,-4.3,-15.05},
                {-5.2,4.8,-24.6},
                {-6.7,-3.9,26.13},
                {-7.1,0,0},
                {0,4.3,0},
                {5.8,1,5.8}
        });
    }

    @Test
    public void multDoubleJUnitTest_06(){
        assertEquals(expectedValue,calculator.mult(a,b),0.0001);
    }
}
