package ru.astondevs;

public class ArrayOperations {
    public static boolean even(int digit) {
        return(digit%2 == 0);
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int digit : digits) {
            if (even(digit)) {
                System.out.print(digit + " ");
            }
        }
    }
}
