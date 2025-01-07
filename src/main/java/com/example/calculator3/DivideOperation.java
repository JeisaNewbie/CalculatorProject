package com.example.calculator3;

public class DivideOperation<T extends Number> extends AbstractOperation {
    @Override
    double operate(Number firstNumber, Number secondNumber) {
        if (secondNumber.doubleValue() == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
            return 0;
        }
        return firstNumber.doubleValue() / secondNumber.doubleValue();
    }
}
