package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int count = 1;
        int middle = 1;
        int number = 0, max = 1, seq = 0;

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++){
            if (number == list.get(i)){
                seq++;
                if (seq > max){
                    max = seq;
                }
            } else {
                number = list.get(i);
                seq = 1;
            }
//            if (Integer.valueOf(list.get(i - 1)).equals(Integer.valueOf(list.get(i)))) {
//                count++;
//                if (count > middle) {
//                    middle = count;
//                }
//            }
//            else {
//                count = 1;
//            }
        }
        System.out.println(max);
    }
}

//        Iterator<Integer> iterator = list.iterator();//получение итератора для списка
//
//        while (iterator.hasNext())      //проверка, есть ли ещё элементы
//        {
//            //получение текущего элемента и переход на следующий
//            Integer text = iterator.next();
//
//            System.out.println(text);
//        }
