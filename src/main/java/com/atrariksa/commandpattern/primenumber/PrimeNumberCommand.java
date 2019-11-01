package com.atrariksa.commandpattern.primenumber;

import com.atrariksa.commandpattern.ICommand;
import com.atrariksa.commandpattern.IInput;

public class PrimeNumberCommand implements ICommand {
    private IInput input;
    public PrimeNumberCommand(IInput input) {
        this.input = input;
    }

    @Override
    public Object execute() throws Exception {
        return input.primeNumbers();
    }
}
