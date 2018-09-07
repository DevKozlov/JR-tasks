package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        double nNumber = Double.parseDouble(sNumber);
        trafficLights(nNumber);
    }

    public static void trafficLights (double a) {
        double b;
        b = a % 5;
        System.out.println(b);
        if (b < 3)
            System.out.println("зеленый");
        else if (b < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}