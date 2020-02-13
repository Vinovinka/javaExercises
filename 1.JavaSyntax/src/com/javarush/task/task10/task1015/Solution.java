package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[2];
//способ 1, валидацию не прошел
//        ArrayList<String> list = new ArrayList<>();
//            list.add(0,"String 1, List 1");
//            list.add(1, "String 2, List 2");
//
//        ArrayList<String> listNext = new ArrayList<>();
//            list.add(0,"String 3, List 3");
//            list.add(1, "String 4, List 4");

//способ 2 с инициализацией двойной скобкой, валидацию прошел
        ArrayList<String> list = new ArrayList<String>() {{
            add("how");
            add("are");
            add("you");
        }};


        array[0] = list;
        array[1] = list;

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}