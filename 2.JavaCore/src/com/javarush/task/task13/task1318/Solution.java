package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {

                FileInputStream file = new FileInputStream(reader.readLine());
                while (file.available()>0){
                    System.out.print((char)file.read());
                }
                System.out.println();
                file.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}