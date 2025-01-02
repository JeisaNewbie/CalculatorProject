package com.example.calculator2;

public class Calculator {
    private AbstractOperation operation;

    //생성자, Operation 1개 초기화 필수
    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    double calculate (int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }

    void setter (AbstractOperation operation) {
        this.operation = operation;
    }
}
