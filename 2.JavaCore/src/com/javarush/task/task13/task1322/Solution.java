package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new SimpleObject<String>() {
            @Override
            public SimpleObject<String> getInstance() {
                return null;
            }
        };
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    abstract static class StringObject implements SimpleObject<String> {
    }
}
