package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float summ = 0;
        float count = 0;

        while (true) {
            int a = Integer.parseInt(reader.readLine());
                if (a == -1)
                break;
                else count++;
                summ = summ + a;
            }
        summ = summ / count;
        System.out.println(summ);
        }
}


