package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        String[] stringArray;
        String line;

        while (fileReader.ready()) {
            line = fileReader.readLine();
            stringArray = line.replaceAll("\\s{2,}", " ").split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                if (words.contains(stringArray[i])) {
                    ++count;
                }
            }
            if (count == 2) {
                System.out.println(line);
            }
            count = 0;
        }
        fileReader.close();
    }
}
