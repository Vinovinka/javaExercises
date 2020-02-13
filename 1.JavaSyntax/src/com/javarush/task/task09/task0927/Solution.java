package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Semen", new Cat("Semen"));
        cats.put("Vaska", new Cat("Vaska"));
        cats.put("Murzik", new Cat("Murzik"));
        cats.put("Boris", new Cat("Boris"));
        cats.put("Goga", new Cat("Goga"));
        cats.put("Tolik", new Cat("Tolik"));
        cats.put("Kotya", new Cat("Kotya"));
        cats.put("Mashka", new Cat("Mashka"));
        cats.put("Zosya", new Cat("Zosya"));
        cats.put("Fedor", new Cat("Fedor"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
