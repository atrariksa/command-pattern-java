package com.atrariksa.commandpattern.test;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.primenumber.PrimeNumberCommand;
import com.atrariksa.commandpattern.primenumber.PrimeNumberInput;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberTest {

    private List<Integer> expectedValue = new ArrayList<>();
    @BeforeTest
    public void prepare() {
        expectedValue.add(2);
        expectedValue.add(3);
        expectedValue.add(5);
        expectedValue.add(7);
        expectedValue.add(11);
    }
    @Test
    public void primeNumberInputTest(){
        PrimeNumberInput primeNumberInput = new PrimeNumberInput(5);
        try {
            Assert.assertEquals(primeNumberInput.primeNumbers(), expectedValue);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            List<Integer> notEqual = new ArrayList<>();
            notEqual.add(2);
            Assert.assertNotEquals(primeNumberInput.primeNumbers(), notEqual);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            primeNumberInput.fibonacciNumber();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_FIBONACCI + Constants.WRONG_OPERATION + primeNumberInput.getClass().getSimpleName());
        }
        try {
            primeNumberInput.sum();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.SUM + Constants.WRONG_OPERATION + primeNumberInput.getClass().getSimpleName());
        }
        try {
            primeNumberInput.multiply();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.MULTIPLY + Constants.WRONG_OPERATION + primeNumberInput.getClass().getSimpleName());
        }
    }

    @Test
    public void primeNumberCommandTest(){
        PrimeNumberCommand primeNumberCommand = new PrimeNumberCommand(new PrimeNumberInput(5));
        try {
            Assert.assertEquals(primeNumberCommand.execute(), expectedValue);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }
}
