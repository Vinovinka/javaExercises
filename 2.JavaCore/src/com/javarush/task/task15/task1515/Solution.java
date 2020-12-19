package com.javarush.task.task15.task1515;

/* 
Статики-2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int A;
    public static int B;

    static {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String sA = bufferedReader.readLine();
            A = Integer.parseInt(sA);
            String sB = bufferedReader.readLine();
            B = Integer.parseInt(sB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {

        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
