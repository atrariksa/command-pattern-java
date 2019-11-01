package com.atrariksa.commandpattern.test;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.simplesum.SumCommand;
import com.atrariksa.commandpattern.simplesum.TwoOperandSumInput;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {
    @Test
    public void twoOperandSumInputTest(){
        TwoOperandSumInput twoOperandSumInput = new TwoOperandSumInput(2, 8);
        try {
            Assert.assertEquals(twoOperandSumInput.sum().intValue(), 10);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            Assert.assertNotEquals(twoOperandSumInput.sum().intValue(), 2);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            twoOperandSumInput.fibonacciNumber();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_FIBONACCI + Constants.WRONG_OPERATION + twoOperandSumInput.getClass().getSimpleName());
        }
        try {
            twoOperandSumInput.multiply();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.MULTIPLY + Constants.WRONG_OPERATION + twoOperandSumInput.getClass().getSimpleName());
        }
        try {
            twoOperandSumInput.primeNumbers();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_PRIME_NUMBER + Constants.WRONG_OPERATION + twoOperandSumInput.getClass().getSimpleName());
        }
    }

    @Test
    public void sumCommandTest(){
        SumCommand sumCommand = new SumCommand(new TwoOperandSumInput(9, 8));
        try {
            Assert.assertEquals(sumCommand.execute(), new Integer(17));
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }
}
