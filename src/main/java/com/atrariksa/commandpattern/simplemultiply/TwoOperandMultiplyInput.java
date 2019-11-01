package com.atrariksa.commandpattern.simplemultiply;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.IInput;
import com.atrariksa.commandpattern.Input;

import java.util.List;

public class TwoOperandMultiplyInput extends Input implements IInput {
    private Integer x;
    private Integer y;
    public TwoOperandMultiplyInput(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer sum() throws Exception {
        throw new Exception(Constants.SUM + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }

    @Override
    public Integer multiply() throws Exception {
        return x.intValue() * y.intValue();
    }

    @Override
    public List<Integer> primeNumbers() throws Exception {
        throw new Exception(Constants.GENERATE_PRIME_NUMBER + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }

    @Override
    public List<Integer> fibonacciNumber() throws Exception {
        throw new Exception(Constants.GENERATE_FIBONACCI + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }
}
