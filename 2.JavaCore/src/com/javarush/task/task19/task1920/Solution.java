package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        StringBuilder sb = new StringBuilder();
        TreeMap<String, Double> map = new TreeMap<>();
        ArrayList<String> keyList = new ArrayList<>();
        String line, key;
        double val;


        while (reader.ready()) {
            line = reader.readLine();
            key = line.split(" ")[0].replaceAll("\\p{Cntrl}","");
            val = Double.parseDouble(line.split(" ")[1]);

            key = FindKey(key, keyList);

            if (map.containsKey(key)) {
                map.put(key, (map.get(key) + val));
            } else {
                map.put(key, val);
            }
        }

        reader.close();

        double max = 0;

        for (Map.Entry <String, Double> entry : map.entrySet()) {
            if (entry.getValue() > max) max = entry.getValue();
        }

        for (Map.Entry <String, Double> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
                //System.out.println(entry.getValue());
            }
        }


    }

    private static String FindKey(String key, ArrayList<String> keyList) {
        for (int i = 0; i < keyList.size(); i++) {
            if (keyList.get(i).equals(key)) {
                return keyList.get(i);
            }
        }
        keyList.add(key);
        return key;
    }
}

