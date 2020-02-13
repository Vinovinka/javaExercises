package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Date dateS;
        SimpleDateFormat dateFormatIn = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        dateS = dateFormatIn.parse(s);

        SimpleDateFormat dateFormatOut = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(dateFormatOut.format(dateS).toUpperCase());
        
    }
}
