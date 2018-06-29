package com.epam.cdp.calculator.junit.tests;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import com.epam.tat.module4.Calculator;

@RunWith(value = Parameterized.class)
public class SumLongJUnitTest_01 {
    private Calculator calculator;

    @Before
    public  void initialize(){
        calculator = new Calculator();
    }

    @Parameter(value = 0)
    public long a;

    @Parameter(value = 1)
    public long b;

    @Parameter(value = 2)
    public long expectedValue;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {10,25,35},
                {11,-2,9},
                {0,0,0},
                {-1,30,29},
                {-5,-7,-12},
                {2,-2,0},
                {3,3,6}
        });
    }

    @Test
    public void sumLongJUnitTest_01(){
        assertThat(calculator.sum(a,b),is(expectedValue));
    }
}
