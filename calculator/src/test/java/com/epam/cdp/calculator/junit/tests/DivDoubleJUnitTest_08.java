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
public class DivDoubleJUnitTest_08 {
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
                {2.25,1.5,1.5},
                {2.02,1.01,2},
                {5.6,1,5.6},
                {-2.25,1.5,-1.5},
                {2.25,-1.5,-1.5},
                {-2.25,-1.5,1.5},
                {0,2.4,0}
        });
    }

    @Test
    public void divDoubleJUnitTest_08(){
        assertEquals(expectedValue,calculator.div(a,b),0.0001);
    }

}
