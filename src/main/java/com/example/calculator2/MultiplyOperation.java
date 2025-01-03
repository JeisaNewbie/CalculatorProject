package com.example.calculator2;

public class MultiplyOperation extends AbstractOperation {
    @Override
    double operate(long firstNumber, long secondNumber) {
        return firstNumber * secondNumber;
    }
}
