package com.example.calculator3;

public class SubstractOperation<T extends Number> extends AbstractOperation {
    @Override
    double operate(Number firstNumber, Number secondNumber) {
        return firstNumber.doubleValue() - secondNumber.doubleValue();
    }
}
