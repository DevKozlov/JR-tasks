package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        String line;
        ArrayList<Integer> listInteger = new ArrayList<>();
        int numericLine = 0;

        while ((line = fileReader.readLine()) != null) {

            numericLine = Integer.parseInt(line);
            if (numericLine % 2 == 0) {
            listInteger.add(numericLine);
            //fileReader.readLine();
            }
        }

        int buffer;

        for (int i = 0; i < listInteger.size(); i++) {
            for (int j = 0; j < listInteger.size(); j++) {
                if (listInteger.get(j) > listInteger.get(i)) {
                    buffer = listInteger.get(i);
                    listInteger.set(i,listInteger.get(j));
                    listInteger.set(j,buffer);
                }
            }
        }

        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        reader.close();
        fileReader.close();
    }
}
