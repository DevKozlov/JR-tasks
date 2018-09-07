package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int maxCount = 0;

        for (int i = 1; i < 10; i++) {

            if (!list.get(i-1).equals(list.get(i))) {

                if (count > maxCount)
                {
                    maxCount = count;
                }
                count = 1;
            } else
                ++count;


        }

        if (count > maxCount) {
            maxCount = count;
        }

        System.out.println(maxCount);
    }
}