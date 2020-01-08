package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> people = new HashMap<>();

        people.put("Иванов", "Иван");
        people.put("Петров", "Петр");
        people.put("Сидоров", "Иван");
        people.put("Смирнов", "Петр");
        people.put("Добров", "Кузьма");
        people.put("Колоколов", "Максим");
        people.put("Козлов", "Семен");
        people.put("Удалов", "Никита");
        people.put("Максимов", "Костя");
        people.put("Петров", "Никита");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
