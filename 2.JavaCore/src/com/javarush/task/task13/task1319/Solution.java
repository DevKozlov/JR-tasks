package com.javarush.task.task13.task1319;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String Path = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(Path));

        String inputString = new String();

        while (!inputString.equals("exit") ) {
            inputString = reader.readLine();
            writer.write(inputString);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}
