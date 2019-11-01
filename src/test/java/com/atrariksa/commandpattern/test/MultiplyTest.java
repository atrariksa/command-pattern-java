package com.atrariksa.commandpattern.test;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.simplemultiply.MultiplyCommand;
import com.atrariksa.commandpattern.simplemultiply.TwoOperandMultiplyInput;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest {
    @Test
    public void twoOperandMultiplyInputTest(){
        TwoOperandMultiplyInput twoOperandMultiplyInput = new TwoOperandMultiplyInput(2, 8);
        try {
            Assert.assertEquals(twoOperandMultiplyInput.multiply().intValue(), 16);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            Assert.assertNotEquals(twoOperandMultiplyInput.multiply().intValue(), 2);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
        try {
            twoOperandMultiplyInput.fibonacciNumber();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_FIBONACCI + Constants.WRONG_OPERATION + twoOperandMultiplyInput.getClass().getSimpleName());
        }
        try {
            twoOperandMultiplyInput.sum();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.SUM + Constants.WRONG_OPERATION + twoOperandMultiplyInput.getClass().getSimpleName());
        }
        try {
            twoOperandMultiplyInput.primeNumbers();
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), Constants.GENERATE_PRIME_NUMBER + Constants.WRONG_OPERATION + twoOperandMultiplyInput.getClass().getSimpleName());
        }
    }

    @Test
    public void multiplyCommandTest(){
        MultiplyCommand multiplyCommand = new MultiplyCommand(new TwoOperandMultiplyInput(9, 8));
        try {
            Assert.assertEquals(multiplyCommand.execute(), new Integer(72));
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }
}
