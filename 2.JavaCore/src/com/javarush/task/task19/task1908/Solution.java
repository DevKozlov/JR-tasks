package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter fileWtiter = new BufferedWriter(new FileWriter(secondFileName));

        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append((char) fileReader.read());
        }

        String sbString = sb.toString().replace(".","!");
        fileWtiter.write(sbString);

        fileReader.close();
        fileWtiter.close();
    }
}
