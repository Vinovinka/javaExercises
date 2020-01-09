package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        method4();
    }

    public static void method4() {
        method5();
    }

    public static void method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for (StackTraceElement s: stackTraceElement) {
            System.out.println(s.toString());
        }
    }
}
