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
public class DivLongJUnitTest_07 {
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
                {8,2,4},
                {0,3,0},
                {9,1,9},
                {1,1,1},
                {21,-3,-7},
                {-45,9,-5},
                {-56,-7,8}
        });
    }

    @Test
    public void divLongJUnitTest_07(){
        assertEquals(expectedValue,calculator.div(a,b),0.0001);
    }

}

