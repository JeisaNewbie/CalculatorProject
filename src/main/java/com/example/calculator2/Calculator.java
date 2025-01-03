package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private final Queue<Double> results = new LinkedList<>();;
    private AbstractOperation operation;

    public Calculator() {}

    //Getter
    double getResult () {
        if (results.isEmpty()) {
            System.out.println("저장된 값이 없습니다.");
            return 0;
        }
        return results.peek();
    }

    //Setter
    void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    void setResult(double result) {
        results.add(result);
    }

    void removeResult() {
        results.poll();
    }

    double calculate (long firstNum, long secondNum, char operator) throws Exception {
        double result = 0;
        switch (operator) {
            case '+':
                this.setOperation(new AddOperation());
                break;
            case '-':
                this.setOperation(new SubstractOperation());
                break;
            case '*':
                this.setOperation(new MultiplyOperation());
                break;
            case '/':
                if (secondNum == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                this.setOperation(new DivideOperation());
                break;
            default:
                throw new BadInputException("+, -, *, / 중 하나의 연산자를 입력하세요.");
        }
        result = operation.operate(firstNum, secondNum);
        return result;
    }
}
