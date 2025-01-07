package com.example.calculator3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArithmeticCalculator {
    private final Deque<Double> results = new ArrayDeque<>();
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

    double calculate (Number firstNum, Number secondNum, String operator) throws Exception {
        double result = 0;
        switch (OperatorType.convertOperatorToString(operator)) {
            case ADD:
                this.setOperation(new AddOperation<Number>());
                break;
            case SUBSTRACT:
                this.setOperation(new SubstractOperation<Number>());
                break;
            case MULTIPLY:
                this.setOperation(new MultiplyOperation<Number>());
                break;
            case DIVIDE:
                if (secondNum.doubleValue() == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                this.setOperation(new DivideOperation<Number>());
                break;
            default:
                throw new BadInputException("+, -, *, / 중 하나의 연산자를 입력하세요.");
        }
        result = operation.operate(firstNum, secondNum);
        return result;
    }
}
