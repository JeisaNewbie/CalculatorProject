package com.example.calculator3;

public class App {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        while(!calculateEnded) {
            try {
                CalculatorApp.start();
            } catch (Exception e) { //CalculatorApp.start()에서 예외를 흘리기 때문에 main에서 받음
                calculateEnded = true;
                System.out.println(e.getMessage());
            }
        }
    }
}