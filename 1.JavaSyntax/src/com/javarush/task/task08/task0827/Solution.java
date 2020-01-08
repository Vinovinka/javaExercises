package com.javarush.task.task08.task0827;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date dateFirst = new Date(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

        Date dateCurrent = new Date("JAN 1 "+ simpleDateFormat.format(dateFirst));

        long msTimeDistance = dateCurrent.getTime() - dateFirst.getTime();

        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);

        return (dayCount % 2 == 0);
    }
}
