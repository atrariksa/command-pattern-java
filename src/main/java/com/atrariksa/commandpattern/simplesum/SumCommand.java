package com.atrariksa.commandpattern.simplesum;

import com.atrariksa.commandpattern.ICommand;
import com.atrariksa.commandpattern.IInput;

public class SumCommand implements ICommand {
    private IInput input;
    public SumCommand(IInput input) {
        this.input = input;
    }

    @Override
    public Object execute() throws Exception {
        return input.sum();
    }
}
