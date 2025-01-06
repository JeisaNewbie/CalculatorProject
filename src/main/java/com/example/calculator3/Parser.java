package com.example.calculator3;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        if (Pattern.matches(NUMBER_REG, firstInput)) {
            arithmeticCalculator.setFirstNumber(Integer.parseInt(firstInput));
        } else {
            throw new BadInputException("숫자");
        }
        return this;

    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        if (Pattern.matches(NUMBER_REG, secondInput)) {
            arithmeticCalculator.setSecondNumber(Integer.parseInt(secondInput));
        } else {
            throw new BadInputException("숫자");
        }
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        if (Pattern.matches(OPERATION_REG, operationInput)) {
            switch (OperatorType.convertOperatorToString(operationInput)) {
                case ADD:
                    arithmeticCalculator.setOperation(new AddOperation());
                    break;
                case SUBSTRACT:
                    arithmeticCalculator.setOperation(new SubstractOperation());
                    break;
                case MULTIPLY:
                    arithmeticCalculator.setOperation(new MultiplyOperation());
                    break;
                case DIVIDE:
                    arithmeticCalculator.setOperation(new DivideOperation());
                    break;
                default:
                    break;
            }
        } else {
            throw new BadInputException("연산자");
        }
        return this;
    }

    public double executeCalculator() {
        return arithmeticCalculator.calculate();
    }
}