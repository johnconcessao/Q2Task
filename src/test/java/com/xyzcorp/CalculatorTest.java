

package com.xyzcorp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {


    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new DefaultCalculator();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }

    @Test
    public void testAdd() {
        double result = calc.add(10.5, 20.32);
        assertEquals(30.82, result, 0);
    }

    @Test
    public void testSubtract() {
        double result = calc.subtract(100.5, 100);
        assertEquals(0.5, result, 0);
    }



    @Test
    public void testDivide() {
        double result = calc.divide(100, 10);
        assertEquals(10, result, 0.001);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(100.5, 0);
    }

}
