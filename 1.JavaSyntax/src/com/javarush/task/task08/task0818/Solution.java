package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 200);
        map.put("Сидоров", 300);
        map.put("Климов", 400);
        map.put("Константинов", 500);
        map.put("Носов", 600);
        map.put("Попов", 700);
        map.put("Комаров", 800);
        map.put("Валиев", 900);
        map.put("Сомов", 90);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int salary = pair.getValue();
            if (salary < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}