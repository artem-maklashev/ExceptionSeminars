package org.example;

public class BadDivisionCalculator {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 0.0;

        try {
            if (num2 == 0) {
                System.out.println("Ошибка: Деление на ноль недопустимо");
            } else {
                double result = num1 / num2;
                System.out.println("Результат деления: " + result);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
