package com.example.calculator3;

public enum OperatorType {
    ADD(new AddOperation<Number>()),
    SUBSTRACT(new SubstractOperation<Number>()),
    MULTIPLY(new MultiplyOperation<Number>()),
    DIVIDE(new DivideOperation<Number>());

    private final AbstractOperation<Number> operation;

    OperatorType(AbstractOperation<Number> operation) {
        this.operation = operation;
    }

    public static AbstractOperation<Number> getOperation(String operator) throws BadInputException {
        switch (operator) {
            case "+":
                return ADD.operation;
            case "-":
                return SUBSTRACT.operation;
            case "*":
                return MULTIPLY.operation;
            case "/":
                return DIVIDE.operation;
            default:
                throw new BadInputException("+, -, *, /");
        }
    }
}
