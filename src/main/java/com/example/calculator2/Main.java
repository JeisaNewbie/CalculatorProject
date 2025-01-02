package com.example.calculator2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation());
        System.out.println("AddOperation: 5, 7 => " + cal.calculate(5, 7));
        cal.setter(new SubstractOperation());
        System.out.println("SubstractOperation: 5, 7 => " + cal.calculate(5, 7));
        cal.setter(new MultiplyOperation());
        System.out.println("MultiplyOperation: 5, 7 => " + cal.calculate(5, 7));
        cal.setter(new DivideOperation());
        System.out.println("DivideOperation: 5, 7 => " + cal.calculate(5, 7));
        System.out.println("DivideOperation: 5, 0 => " + cal.calculate(5, 0));
    }
}
