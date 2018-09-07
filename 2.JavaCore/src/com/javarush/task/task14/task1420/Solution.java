package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Number1 = 0;
        int Number2 = 0;
        int maxNumber = 0;
        int NOD = 0;
        try {
            Number1 = Integer.parseInt(reader.readLine(),10);
        } catch (Exception e) {
            throw e;
        }
        if (Number1 <= 0) {
            throw new Exception();
        }

        try {
            Number2 = Integer.parseInt(reader.readLine(),10);
        } catch (Exception e) {
            throw e;
        }
        if (Number2 <= 0) {
            throw new Exception();
        }

        if (Number1 > Number2) {
            maxNumber = Number1;
        } else {
            maxNumber = Number2;
        }

        for (int i = 1; i < maxNumber; i++) {
            if (Number1 % i == 0 && Number2 % i == 0) {
                NOD = i;
            }
        }

        System.out.println(NOD);
    }
}
