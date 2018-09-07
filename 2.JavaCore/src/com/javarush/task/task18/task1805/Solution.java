package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        HashSet<Integer> list = new HashSet<>();
        ArrayList<Integer> listSorted = new ArrayList<>();


        while (file.available() > 0) {
            list.add(file.read());
        }
        reader.close();
        file.close();

        for (Integer item : list) {
            listSorted.add(item);
        }

        listSorted.sort(Comparator.naturalOrder());
        for (int i = 0; i < listSorted.size(); i++) {
            System.out.print(listSorted.get(i) + " ");
        }

    }
}