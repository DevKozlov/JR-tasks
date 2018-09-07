package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        yearDays(nNumber);
    }

    public static void yearDays(int a) {
        int x = 365;
        if (a % 4 == 0) {
            x = 366;
            if (a % 100 == 0) {
                x = 365;
                if (a % 400 == 0) {
                    x = 366;
                }
            }
        }
        System.out.println("количество дней в году: " + x);
   }
}