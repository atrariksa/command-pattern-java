package com.atrariksa.commandpattern.simplemultiply;

import com.atrariksa.commandpattern.ICommand;
import com.atrariksa.commandpattern.IInput;

public class MultiplyCommand implements ICommand {
    private IInput input;
    public MultiplyCommand(IInput input) {
        this.input = input;
    }

    @Override
    public Object execute() throws Exception {
        return input.multiply();
    }
}
