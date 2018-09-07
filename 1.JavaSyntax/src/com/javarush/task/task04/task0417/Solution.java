package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);
        int nNumber3 = Integer.parseInt(sNumber3);
        compare(nNumber1,nNumber2,nNumber3);
    }

    public static void compare(int a, int b, int c) {
        int count = 0;
        int number = 0;
        if (a == b) {
            ++count;
            number = a;
        }
        if (b == c) {
            ++count;
            number = b;
        }
        if (a == c) {
            ++count;
            number = c;
        }
        if (count == 1) {
            ++count;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(number + " ");
        }

    }
}