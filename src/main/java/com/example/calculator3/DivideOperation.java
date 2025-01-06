package com.example.calculator3;

public class DivideOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("0으로 나눌 수 없습니다!");
            return 0;
        }
        return (double) firstNumber / secondNumber;
    }
}
