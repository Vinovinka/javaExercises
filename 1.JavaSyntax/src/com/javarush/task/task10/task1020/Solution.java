package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }
//сортировка методом Шелла
    public static void sort(int[] array) {
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
    }
}
