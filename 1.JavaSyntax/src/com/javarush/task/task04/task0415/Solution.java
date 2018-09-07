package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);
        int nNumber3 = Integer.parseInt(sNumber3);
        rectangle(nNumber1, nNumber2, nNumber3);
    }

    public static void rectangle(int a, int b, int c) {
        if (a + b <= c || b + c <= a || a + c <= b)
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}