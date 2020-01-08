package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.Reader;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (maxLength < list.get(i).length()) {
                maxLength = list.get(i).length();
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (minLength > list.get(i).length()) {
                minLength = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minLength) {
                System.out.println(list.get(i));
                break;
            } else if (list.get(i).length() == maxLength) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
