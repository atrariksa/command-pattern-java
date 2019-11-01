package com.atrariksa.commandpattern.fibonacci;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.IInput;
import com.atrariksa.commandpattern.Input;

import java.util.ArrayList;
import java.util.List;

public class FibonacciInput extends Input implements IInput {
    private Integer x;
    private List<Integer> output = new ArrayList<>();
    public FibonacciInput(Integer x) {
        this.x = x;
    }

    @Override
    public Integer sum() throws Exception {
        throw new Exception(Constants.SUM + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }

    @Override
    public Integer multiply() throws Exception {
        throw new Exception(Constants.MULTIPLY + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }

    @Override
    public List<Integer> primeNumbers() throws Exception {
        throw new Exception(Constants.GENERATE_PRIME_NUMBER + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }

    @Override
    public List<Integer> fibonacciNumber() throws Exception {
        if (x.intValue() == 0) {
            throw new Exception(Constants.FIBONACCI_INPUT_ERROR);
        }
        return fibonacci(output);
    }
    private List<Integer> fibonacci(List<Integer> input) {
        int size = input.size();
        if (size == x.intValue()) {
            return input;
        }
        if (size == 0) {
            input.add(0);
            return fibonacci(input);
        }
        else if (size == 1) {
            input.add(1);
            return fibonacci(input);
        }
        else {
            int x = input.get(size-2);
            int y = input.get(size-1);
            input.add(x+y);
            return fibonacci(input);
        }
    }
}
