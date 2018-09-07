package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String line;
        String[] stringArray;

        Matcher m;

        while (reader.ready()) {
            line = reader.readLine();
            stringArray = line.split(" ");

            for (int i = 0; i < stringArray.length; i++) {
                m = Pattern.compile("[0-9]").matcher(stringArray[i]);
                if(m.find()) {
                    writer.write(stringArray[i] + " ");
                }
            }
        }

        reader.close();
        writer.close();
    }
}
