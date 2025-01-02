package com.example.calculator2;

public class DivideOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Divide by zero");
            return 0;
        }
        return (double) firstNumber / secondNumber;
    }
}