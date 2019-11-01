package com.atrariksa.commandpattern.fibonacci;

import com.atrariksa.commandpattern.ICommand;
import com.atrariksa.commandpattern.IInput;

public class FibonacciCommand implements ICommand {
    private IInput input;
    public FibonacciCommand(IInput input) {
        this.input = input;
    }

    @Override
    public Object execute() throws Exception {
        return input.fibonacciNumber();
    }
}
