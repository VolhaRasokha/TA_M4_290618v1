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
public class SubDoubleJUnitTest_04 {
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
                {3.2,2.1,1.1},
                {2.2,3.8,-1.6},
                {5.6,-4.1,9.7},
                {-6.3,3.2,-9.5},
                {-7.5,-3.3,-4.2},
                {4.1,4.1,0},
                {1.3,0.3,1}
        });
    }

    @Test
    public void subDoubleJUnitTest_04(){
        assertEquals(expectedValue,calculator.sub(a,b),0.0001);
    }
}
