package com.atrariksa.commandpattern.fibonacci;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.IInput;
import com.atrariksa.commandpattern.Input;

import java.util.ArrayList;
import java.util.List;

public class FibonacciInput extends Input implements IInput {
    private Integer x;
    private List<Integer> output;
    private boolean isRecursive;
    public FibonacciInput(Integer x) {
        this.x = x;
    }
    public FibonacciInput(Integer x, boolean isRecursive) {
        this.x = x;
        this.isRecursive = isRecursive;
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
        output = new ArrayList<>();
        if (x.intValue() == 0) {
            throw new Exception(Constants.FIBONACCI_INPUT_ERROR);
        }
        if (isRecursive) {
            return recursiveFibonacci(output);
        }
        else {
            return loopingFibonacci();
        }
    }
    private List<Integer> loopingFibonacci() {
        if (x.intValue() == 1) {
            output.add(0);
            return output;
        }
        else if (x.intValue() == 2) {
            output.add(0);
            output.add(1);
            return output;
        }
        else {
            output.add(0);
            output.add(1);
            while (output.size() < x.intValue()) {
                int size = output.size();
                int x = output.get(size-2);
                int y = output.get(size-1);
                output.add(x+y);
            }
            return output;
        }
    }
    private List<Integer> recursiveFibonacci(List<Integer> input) {
        int size = input.size();
        if (size == x.intValue()) {
            return input;
        }
        if (size == 0) {
            input.add(0);
            return recursiveFibonacci(input);
        }
        else if (size == 1) {
            input.add(1);
            return recursiveFibonacci(input);
        }
        else {
            int x = input.get(size-2);
            int y = input.get(size-1);
            input.add(x+y);
            return recursiveFibonacci(input);
        }
    }
}
