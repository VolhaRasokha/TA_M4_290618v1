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
public class SubLongJUnitTest_03 {
    private Calculator calculator;

    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @Parameterized.Parameter(value = 0)
    public long a;

    @Parameterized.Parameter(value = 1)
    public long b;

    @Parameterized.Parameter(value = 2)
    public long expectedValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {3,2,1},
                {3,4,-1},
                {5,-4,9},
                {-6,3,-9},
                {-7,-3,-4},
                {4,4,0}
        });
    }

    @Test
    public void subLongJUnitTest_03() {
        assertThat(calculator.sub(a, b), is(expectedValue));
    }
}
