package com.atrariksa.commandpattern;

import java.util.List;

public interface IInput {
    Integer sum() throws Exception;
    Integer multiply() throws Exception;
    List<Integer> primeNumbers() throws Exception;
    List<Integer> fibonacciNumber() throws Exception;
}
