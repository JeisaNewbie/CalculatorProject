package com.example.calculator3;

public abstract class AbstractOperation <T extends Number>{
    abstract double operate(T firstNumber, T secondNumber);
}
