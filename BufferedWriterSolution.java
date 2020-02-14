package com.javarush.task.task13.task1319;

import java.io.*;

/* 
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.

*/

public class Solution {
    public static void main(String[] args) {

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); 
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // connect InputStreamReader with BufferedReader

            File file = new File(bufferedReader.readLine());
            FileWriter fileWriter = new FileWriter(file); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // connect FileWriter with BufferedWriter

            String line;
            do {
                line = bufferedReader.readLine();
                bufferedWriter.write(line + "\n");
            } while (line.compareTo("exit") != 0);

            bufferedReader.close(); // close flow
            bufferedWriter.close(); // close flow
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}