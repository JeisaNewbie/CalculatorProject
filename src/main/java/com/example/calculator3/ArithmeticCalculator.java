package com.example.calculator3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArithmeticCalculator {
    private final Deque<Double> results = new ArrayDeque<>(); //마지막 값을 꺼내서 비교하기 위해 Queue 대신 Deque 사용
    private AbstractOperation<Number> operation;

    public ArithmeticCalculator() {}

    //Getter
    double getResult () {
        if (results.isEmpty()) {
            System.out.println("저장된 값이 없습니다.");
            return 0;
        }
        return results.peek();
    }

    Deque<Double> getResults () {
        return results;
    }

    //Setter
    void setOperation(AbstractOperation<Number> operation) {
        this.operation = operation;
    }

    void setResult(double result) {
        results.add(result);
    }

    void removeResult() {
        results.poll();
    }

    double calculate (Number firstNum, Number secondNum, String operator) {
        this.setOperation(OperatorType.getOperation(operator));
        return operation.operate(firstNum, secondNum);
    }
}
