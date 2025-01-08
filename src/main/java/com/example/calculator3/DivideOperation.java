package com.example.calculator3;

public class DivideOperation<T extends Number> extends AbstractOperation {
    @Override
    double operate(Number firstNumber, Number secondNumber) throws ArithmeticException {
        if (secondNumber.doubleValue() == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }
}
