package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String line;

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));

        while (reader1.ready()) {
            line = reader1.readLine();
            StringBuilder sb = new StringBuilder(line);
            System.out.println(sb.reverse());
        }

        reader1.close();
    }
}
