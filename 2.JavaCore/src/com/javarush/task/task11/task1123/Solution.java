package com.javarush.task.task11.task1123;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //копирую содержимое первого массива в новый массив
        int array[] = Arrays.copyOf(inputArray, inputArray.length);

        //сортирую новый массив методом Шелла
        int d = array.length/2;
        while (d > 0) {
            for (int i = 0; i < (array.length - d); i++) {
                int j = i;
                while ((j >= 0) && (array[j] > array[j + d])) {
                    int temp = array[j];
                    array[j] = array[j + d];
                    array[j + d] = temp;
                    j--;
                }
            }
            d = d/2;
        }

        return new Pair<Integer, Integer>(array[0], array[array.length - 1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
