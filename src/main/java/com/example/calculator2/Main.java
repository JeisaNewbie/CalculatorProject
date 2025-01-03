package com.example.calculator2;

<<<<<<< HEAD
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {};
        int[] ret = {};
        int divisor = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0)
                numbers.add(num);
        }
        if (numbers.size() == 0)
            System.out.println(-1);
        ret = numbers.stream().mapToInt(i -> i).toArray();
=======
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
>>>>>>> origin/cal_without_class
    }
}
