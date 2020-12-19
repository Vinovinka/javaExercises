package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(3, 4,"9");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (boolean) value);
    }

    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (char) value);
    }

    public static void printMatrix(int m, int n, float value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (float) value);
    }

    public static void printMatrix(int m, int n, double value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (double) value);
    }

    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (long) value);
    }

    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (byte) value);
    }

    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (short) value);
    }

    public static void printMatrix(int m, int n, int value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (int) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
