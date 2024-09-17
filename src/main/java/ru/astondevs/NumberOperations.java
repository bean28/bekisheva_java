package ru.astondevs;

import java.util.Scanner;

public class NumberOperations {

    public static int compare(int a, int b) {
        if (a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b: ");
        int b = scanner.nextInt();
        int result = compare(a, b);
        if (result == -1) {
            System.out.println("a < b");
        } else if (result == 0) {
            System.out.println("a = b");
        } else {
            System.out.println("a > b");
        }
        System.out.println("Сумма чисел - " + sum(a,b));
        System.out.println("Разность чисел - " + subtraction(a,b));
        System.out.println("Произведение чисел - " + multiply(a,b));
        System.out.println("Частное чисел - " + division(a,b));
    }
}
