package com.example.calculator3;

public enum OperatorType {
    ADD,
    SUBSTRACT,
    MULTIPLY,
    DIVIDE,
    NOTOPERATOR;

    public static OperatorType convertOperatorToString(String operator) {
        switch (operator) {
            case "+":
                return ADD;
            case "-":
                return SUBSTRACT;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVIDE;
            default:
                return NOTOPERATOR;
        }
    }
}
