package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(reader.readLine());
        if (firstNumber <= 0) throw new NumberFormatException();

        int secondNumber = Integer.parseInt(reader.readLine());
        if (secondNumber <= 0) throw new NumberFormatException();

        System.out.println(gcd(firstNumber, secondNumber));

    }

    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }


}
