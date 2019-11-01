package com.atrariksa.commandpattern;

import java.util.List;

public interface IInput {

    /**
     * Simple sum for two operand
     */
    Integer sum() throws Exception;

    /**
     * Simple multiply for two operand
     */
    Integer multiply() throws Exception;

    /**
     * Simple prime number generator
     */
    List<Integer> primeNumbers() throws Exception;

    /**
     * Fibonacci generator with and without recursive. Beware of StackOverflowError when using recursive fibonacci
     */
    List<Integer> fibonacciNumber() throws Exception;
}
