package com.epam.cdp.calculator.junit.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.epam.tat.module4.Calculator;

@RunWith(value = Parameterized.class)
public class MultLongJUnitTest_05 {
    private Calculator calculator;

    @Before
    public  void initialize(){
        calculator = new Calculator();
    }

    @Parameterized.Parameter(value = 0)
    public long a;

    @Parameterized.Parameter(value = 1)
    public long b;

    @Parameterized.Parameter(value = 2)
    public long expectedValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {0,2,0},
                {4,0,0},
                {5,1,5},
                {1,6,6},
                {15,25,375},
                {2,-3,-6},
                {-2,3,-6},
                {-2,-3,6}
        });
    }

    @Test
    public void multLongJUnitTest_05(){
        assertThat(calculator.mult(a,b),is(expectedValue));
    }
}
