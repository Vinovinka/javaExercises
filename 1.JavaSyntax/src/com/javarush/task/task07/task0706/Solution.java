package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[15];
        int count = 0;
        for (int i = 0; people.length > i; i++) {
            
            String s = reader.readLine();
            people[i] = parseInt(s);
            
            if (i%2 == 0) {
                count+=people[i];
            } 
            else {
                count-=people[i];
            }
        }
        //System.out.println( odd<even ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.");
        if (count > 0) {
            System.out.print("В домах с четными номерами проживает больше жителей.");
//        }
//        else if (count == 0) {
//            System.out.print("В домах с четными номерами проживает больше жителей.");
        } else
        {
            System.out.print("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
