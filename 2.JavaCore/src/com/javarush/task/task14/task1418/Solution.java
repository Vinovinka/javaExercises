package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();

        initList(list);
        processCastedObjects(list);
        printListValues(list);

    }

    static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void initList(List<Number> list) {
        list.add((double) 1000f);
        list.add(new Double("123e-445632"));
        list.add((float) (-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            if (object instanceof Float) {
                Double a = object.doubleValue();
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Float a = object.floatValue();
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}
