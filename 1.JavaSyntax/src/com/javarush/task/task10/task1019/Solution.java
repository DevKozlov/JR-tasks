package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int id;
        String str;
        while (true) {

            str = reader.readLine();
            String name = reader.readLine();
            if (name.isEmpty() && str.isEmpty()) {
                break;
            }
            id = Integer.parseInt(str);
            System.out.println(id + " " + name);
            map.put(name, id);
        }

        for (HashMap.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
