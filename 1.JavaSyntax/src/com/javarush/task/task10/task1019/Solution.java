package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        try {
            while (true) {
                String s = reader.readLine();
                if (s.isEmpty())
                    break;

                int id = Integer.parseInt(s);
                String name = reader.readLine();

                if (name.isEmpty()) {
                    map.put("", id);
                    break;
                }
                map.put(name, id);
            }
        }
        catch (Exception e) {
        }
        Set<HashMap.Entry<String, Integer>> entries = map.entrySet();
        for (HashMap.Entry<String, Integer> pair: entries) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }
}
