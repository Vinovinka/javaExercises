package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> pair = new HashMap<String, String>();
        pair.put("Иванов", "Антон");
        pair.put("Петров", "Михаил");
        pair.put("Смирнова", "Анастасия");
        pair.put("Сидорова", "Антонина");
        pair.put("Васильев", "Глеб");
        pair.put("Грачева", "Зоя");
        pair.put("Сидоренко", "София");
        pair.put("Кострова", "Анна");
        pair.put("Потапов", "Михаил");
        pair.put("Кубышкин", "Иван");

        return pair;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int count = 0;
        for (Map.Entry<String, String> pair :map.entrySet()) {

            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;
        for (Map.Entry<String, String> pair :map.entrySet()) {

            if (pair.getKey().equals(lastName)) countLastName++;
        }
        return countLastName;
    }

    public static void main(String[] args) {
//        int countTheSameFirstName = getCountTheSameFirstName(createMap(), "Иван");
//        System.out.println(countTheSameFirstName);
//
//        int countTheLastName = getCountTheSameLastName(createMap(), "Иванов");
//        System.out.println(countTheLastName);
    }
}
