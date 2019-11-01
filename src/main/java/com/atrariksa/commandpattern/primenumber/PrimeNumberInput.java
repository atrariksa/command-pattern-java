package com.atrariksa.commandpattern.primenumber;

import com.atrariksa.commandpattern.Constants;
import com.atrariksa.commandpattern.IInput;
import com.atrariksa.commandpattern.Input;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInput extends Input implements IInput {
    private Integer x;
    private List<Integer> output = new ArrayList<>();
    public PrimeNumberInput(Integer x) {
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
        if (x.intValue() < 1) {
            throw new Exception(Constants.PRIME_NUMBER_INPUT_ERROR);
        }
        int index = 2;
        while (output.size() < x) {
            if (isPrimeNumber(index)) {
                output.add(index);
            }
            index++;
        }
        return output;
    }

    private boolean isPrimeNumber(int input) {
        if (input == 2) {
            return true;
        }
        if (input % 2 == 0) {
            return false;
        }
        int half = input/2;
        for (int i = 2; i < half; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Integer> fibonacciNumber() throws Exception {
        throw new Exception(Constants.GENERATE_FIBONACCI + Constants.WRONG_OPERATION + this.getClass().getSimpleName());
    }
}
