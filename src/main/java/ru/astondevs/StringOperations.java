package ru.astondevs;

import java.util.Scanner;

public class StringOperations {
    public static String compare(String someText1, String someText2) {
        if (someText1.equals(someText2)) {
            return "Строки идентичны";
        } else {
            return "Строки неидентичны";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 'a'");
        String someText1 = scanner.nextLine();
        System.out.println("Введите строку 'b'");
        String someText2 = scanner.nextLine();
        System.out.println(compare(someText1, someText2));
    }
}
