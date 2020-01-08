package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JANUARY 2 2001"));
        map.put("Петров", dateFormat.parse("FEBRUARY 4 2006"));
        map.put("Сидоров", dateFormat.parse("MARCH 8 2010"));
        map.put("Смирнов", dateFormat.parse("APRIL 11 2005"));
        map.put("Коновалов", dateFormat.parse("MAY 21 2011"));
        map.put("Котов", dateFormat.parse("JUNE 4 2011"));
        map.put("Степанов", dateFormat.parse("SEPTEMBER 21 2013"));
        map.put("Баранов", dateFormat.parse("OCTOBER 27 2010"));
        map.put("Игнатенко", dateFormat.parse("NOVEMBER 24 2013"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();

            if (month >= 5 && month <= 7){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
