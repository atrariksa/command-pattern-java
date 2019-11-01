package com.atrariksa.commandpattern.test;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.fibonacci.FibonacciCommand;
import com.atrariksa.commandpattern.fibonacci.FibonacciInput;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {

    private List<Integer> expectedValue = new ArrayList<>();
    @BeforeTest
    public void prepare() {
        expectedValue.add(0);
        expectedValue.add(1);
        expectedValue.add(1);
        expectedValue.add(2);
        expectedValue.add(3);
        expectedValue.add(5);
        expectedValue.add(8);
    }
    @Test
    public void fibonacciInputTest(){
        FibonacciInput fibonacciInput = new FibonacciInput(7);
        try {
            Assert.assertEquals(fibonacciInput.fibonacciNumber(), expectedValue);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            List<Integer> notEqual = new ArrayList<>();
            notEqual.add(2);
            Assert.assertNotEquals(fibonacciInput.fibonacciNumber(), notEqual);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            fibonacciInput.primeNumbers();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_PRIME_NUMBER + Constants.WRONG_OPERATION + fibonacciInput.getClass().getSimpleName());
        }
        try {
            fibonacciInput.sum();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.SUM + Constants.WRONG_OPERATION + fibonacciInput.getClass().getSimpleName());
        }
        try {
            fibonacciInput.multiply();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.MULTIPLY + Constants.WRONG_OPERATION + fibonacciInput.getClass().getSimpleName());
        }
    }

    @Test
    public void fibonacciCommandTest(){
        FibonacciCommand fibonacciCommand = new FibonacciCommand(new FibonacciInput(7));
        try {
            Assert.assertEquals(fibonacciCommand.execute(), expectedValue);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }
}
