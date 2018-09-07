package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);

        int iterator = 1;
        int data;

        while (fileReader.ready()) {
            data = fileReader.read();
            if (iterator % 2 == 0) {
                fileWriter.write(data);
            }
            ++iterator;
        }

        fileReader.close();
        fileWriter.close();
    }
}
