package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.1, "sam");
        labels.put(1.3, "molly");
        labels.put(2.3, "lucy");
        labels.put(4.2, "ann");
        labels.put(5.9, "fred");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
