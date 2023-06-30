package org.example;

public class SimpleCalculator {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int sum = addNumbers(num1, num2);
        System.out.println("Сумма чисел: " + sum);
    }
}
