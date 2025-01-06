package com.example.calculator3;

public class ArithmeticCalculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public ArithmeticCalculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public ArithmeticCalculator() {
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }
}
