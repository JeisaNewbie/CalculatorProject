package com.example.calculator2;

public class AddOperation extends AbstractOperation {

    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
