package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();

        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);

        if (nNumber1 > 0 && nNumber2 > 0) {
            System.out.println("1");
        } else if (nNumber1 < 0 && nNumber2 > 0) {
            System.out.println("2");
        } else if (nNumber1 < 0 && nNumber2 < 0) {
            System.out.println("3");
        } else if (nNumber1 > 0 && nNumber2 < 0) {
            System.out.println("4");
        }
    }
}
