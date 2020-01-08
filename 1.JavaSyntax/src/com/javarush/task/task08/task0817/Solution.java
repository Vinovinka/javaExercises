package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> pair = new HashMap<String, String>();
        pair.put("Иванов", "Иван");
        pair.put("Петров", "Антон");
        pair.put("Смирнов", "Иван");
        pair.put("Сидоров", "Кузьма");
        pair.put("Колобов", "Леонид");
        pair.put("Соловьев", "Иван");
        pair.put("Золоторенко", "Алевтина");
        pair.put("Крылов", "Никита");
        pair.put("Карманов", "Петр");
        pair.put("Злотовая", "Александра");

        return pair;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> names = new ArrayList<String>(map.values());
        for(int i = 0; i<names.size(); i++)
            for(int j = i+1; j < names.size(); j++)
                if(names.get(i).equals(names.get(j))) removeItemFromMapByValue(map, names.get(i));

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(createMap());
    }
}
