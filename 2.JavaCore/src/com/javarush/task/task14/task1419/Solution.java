package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.lang.ArithmeticException;
import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArrayStoreException;
import java.lang.ClassCastException;
import java.util.MissingResourceException;
import java.lang.StringIndexOutOfBoundsException;
import java.lang.NegativeArraySizeException;
import java.lang.NumberFormatException;
import java.lang.UnsupportedOperationException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new NullPointerException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new StringIndexOutOfBoundsException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new UnsupportedOperationException());

    }
}
