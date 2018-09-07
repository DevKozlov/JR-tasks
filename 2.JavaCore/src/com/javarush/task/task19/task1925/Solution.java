package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//import static jdk.nashorn.internal.objects.NativeString.trim;


public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String result;
        String line;
        String[] stringArray;
        StringBuilder stringBuilder = new StringBuilder();

        while (reader.ready()) {
            line = reader.readLine();
            stringArray = line.split(" ");

            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].length() > 6) {
                    stringBuilder.append(stringArray[i] + ",");
                }
            }
        }
        reader.close();
        result = stringBuilder.toString();
        result = result.substring(0,result.length()-1);


        writer.write(result);
        writer.close();
    }
}
