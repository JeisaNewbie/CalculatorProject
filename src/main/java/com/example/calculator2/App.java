package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("계산하시겠습니까? (exit 입력시 종료)");
        while (!scanner.nextLine().equals("exit")) {
            try {
                System.out.println("첫번째 숫자를 입력하세요: ");
                long firstNum = Long.parseLong(scanner.nextLine());
                System.out.println("두번째 숫자를 입력하세요: ");
                long secondNum = Long.parseLong(scanner.nextLine());
                System.out.println("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                char operator = scanner.nextLine().charAt(0);
                cal.setResult(cal.calculate(firstNum, secondNum, operator));
                System.out.println("결과는 " + cal.getResult() + " 입니다.");
            } catch (ArithmeticException | BadInputException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력하였습니다." + e.getMessage().split(": ")[1] + "\n양의 정수를 입력해주세요.");
            }
            cal.removeResult();
            System.out.println("계산하시겠습니까? (exit 입력시 종료)");
        }
        System.out.println("종료되었습니다.");
    }
}