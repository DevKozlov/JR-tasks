package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nString = reader.readLine();
        ArrayList<String> array = new ArrayList<String>();


        while (!nString.equals("end")) {
            array.add(nString);
            nString = reader.readLine();
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}