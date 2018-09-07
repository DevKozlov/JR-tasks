package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);

        int iterator = 0;

        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append((char)fileReader.read());
        }

        String sbString = sb.toString();
        //System.out.println(sbString);

        //sbString = sbString.replaceAll("\\s+","");
        String[] stringArray = sbString.split("[ .,\\r\\n: ;!?()\\/\\\"-]");

        for (int i = 0; i < stringArray.length; i++) {
           // System.out.println(stringArray[i]);
            if (stringArray[i].replaceAll("\\s+","").equals("world")) {
                ++iterator;
            }
        }
        System.out.println(iterator);
        fileReader.close();
    }
}
