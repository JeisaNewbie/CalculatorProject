package com.example.calculator2;

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
    }
}
