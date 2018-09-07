package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> listEntry = new HashMap<>();
        int buffer = 0;
        int min = 300;

        while (file.available() > 0) {
            list.add(file.read());
        }
        reader.close();
        file.close();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    ++buffer;
                }
            }

            listEntry.put(list.get(i), buffer);
            if (buffer < min) {
                min = buffer;
            }
            buffer = 0;
        }




        for (Map.Entry listItem: listEntry.entrySet()) {
            if ((int)listItem.getValue() == min) {
                System.out.print(listItem.getKey() + " ");
            }

        }


    }
}
