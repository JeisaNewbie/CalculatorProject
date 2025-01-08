package com.example.calculator3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();

        System.out.println("계산하시겠습니까? (exit 입력시 종료)");
        while (!scanner.nextLine().equals("exit")) {
            try {
                System.out.println("첫번째 숫자를 입력하세요: ");
                Double firstNum = Double.parseDouble(scanner.nextLine());
                System.out.println("두번째 숫자를 입력하세요: ");
                Double secondNum = Double.parseDouble(scanner.nextLine());
                System.out.println("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                String operator = scanner.nextLine();
                cal.setResult(cal.calculate(firstNum, secondNum, operator)); //계산 후 해당 값을 저장
                System.out.println("결과는 " + cal.getResult() + " 입니다.");
            } catch (ArithmeticException | BadInputException e) { //0으로 나누거나 사칙연산 기호가 아닌 값이 들어올 경우 예외처리
                System.out.println(e.getMessage());
                System.out.println("계산하시겠습니까? (exit 입력시 종료)");
                continue;
            } catch (Exception e) {
                System.out.println("잘못된 값을 입력하였습니다." + e.getMessage().split(": ")[1] + "\n양의 정수를 입력해주세요.");
                System.out.println("계산하시겠습니까? (exit 입력시 종료)");
                continue;
            }

            //마지막으로 저장된 값을 꺼내서 조건에 맞는 값을 filtering
            List<Double> filterList = cal.getResults().stream().filter((ret) -> {
                Double result = cal.getResults().getLast();
                return result < ret;
            }).toList();

            System.out.println("마지막 값 " + cal.getResults().getLast() + " 보다 큰 값은");
            if (!filterList.isEmpty()) {
                filterList.forEach(ret -> System.out.println("-> " + ret));
                System.out.println("입니다.");
            } else {
                System.out.println("없습니다.");
            }
            System.out.println("계산하시겠습니까? (exit 입력시 종료)");
        }
        System.out.println("종료되었습니다.");
    }
}