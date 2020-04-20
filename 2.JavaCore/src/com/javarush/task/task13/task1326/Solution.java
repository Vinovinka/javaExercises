package com.javarush.task.task13.task1326;

import java.util.*;
import java.lang.*;
import java.io.*;
/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             InputStream fileInputStream = new FileInputStream(reader.readLine());
             BufferedReader bReader = new BufferedReader(new InputStreamReader(fileInputStream))) {

            String data;
            while ((data = bReader.readLine()) != null) {
                if (Integer.parseInt(data) % 2 == 0) {
                    list.add(Integer.parseInt(data));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < list.size(); i++) {
            Integer min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                Integer tmp = list.get(i);
                list.set(i, min);
                list.set(minIndex, tmp);
            }
        }

        for (Integer el: list) {
            System.out.println(el);
        }
    }
}
