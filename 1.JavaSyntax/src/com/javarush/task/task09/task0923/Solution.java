package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String vovel = "";
        String consonant = "";

        for (int i = 0; i < s.length(); i++ ) {
            if (isVowel(s.charAt(i))) {
                vovel += s.substring(i, i+1) + " ";
            }
            else {
                if (s.charAt(i) != ' ') {
                    consonant += s.substring(i, i+1) + " ";
                }
            }
        }
        System.out.println(vovel);
        System.out.println(consonant);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}