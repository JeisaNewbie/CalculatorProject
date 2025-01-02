package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산하시겠습니까? (exit 입력시 종료)");
        while (!scanner.nextLine().equals("exit")) {
            try {
                System.out.println("첫번째 숫자를 입력하세요: ");
                long firstNum = Long.parseLong(scanner.nextLine());
                System.out.println("두번째 숫자를 입력하세요: ");
                long secondNum = Long.parseLong(scanner.nextLine());
                System.out.println("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                char operator = scanner.nextLine().charAt(0);
                switch (operator) {
                    case '+':
                        System.out.println(firstNum + secondNum);
                        break;
                    case '-':
                        System.out.println(firstNum - secondNum);
                        break;
                    case '*':
                        System.out.println(firstNum * secondNum);
                        break;
                    case '/':
                        if (secondNum == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                            break;
                        }
                        System.out.println((double) firstNum / secondNum);
                        break;
                    default:
                        System.out.println("+, -, *, / 중 하나의 연산자를 입력하세요.");
                }
                System.out.println("계산하시겠습니까? (exit 입력시 종료)");
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력하였습니다: " + e.getMessage().split(": ")[1] + "\n양의 정수를 입력해주세요.");
                return;
            }
        }
        System.out.println("종료되었습니다.");
    }
}