package com.atrariksa.commandpattern;

import com.atrariksa.commandpattern.fibonacci.FibonacciCommand;
import com.atrariksa.commandpattern.fibonacci.FibonacciInput;
import com.atrariksa.commandpattern.primenumber.PrimeNumberCommand;
import com.atrariksa.commandpattern.primenumber.PrimeNumberInput;
import com.atrariksa.commandpattern.simplemultiply.MultiplyCommand;
import com.atrariksa.commandpattern.simplemultiply.TwoOperandMultiplyInput;
import com.atrariksa.commandpattern.simplesum.SumCommand;
import com.atrariksa.commandpattern.simplesum.TwoOperandSumInput;

public class CommandPattern {
    public static void main(String[] args) throws Exception {
        SumCommand sumCommand = new SumCommand(new TwoOperandSumInput(7,8));
        Object sumOutput = sumCommand.execute();
        System.out.println(sumOutput);
        MultiplyCommand multiplyCommand = new MultiplyCommand(new TwoOperandMultiplyInput(7,8));
        Object multiplyOutput = multiplyCommand.execute();
        System.out.println(multiplyOutput);
        PrimeNumberCommand primeNumberCommand = new PrimeNumberCommand(new PrimeNumberInput(11));
        Object primeNumberOutput = primeNumberCommand.execute();
        System.out.println(primeNumberOutput);
        FibonacciCommand fibonacciCommand = new FibonacciCommand(new FibonacciInput(20000));
        Object fibonacciOutput = fibonacciCommand.execute();
        System.out.println(fibonacciOutput);
        FibonacciCommand fibonacciRecursiveCommand = new FibonacciCommand(new FibonacciInput(8, true));
        Object fibonacciRecursiveOutput = fibonacciRecursiveCommand.execute();
        System.out.println(fibonacciRecursiveOutput);
    }
}
