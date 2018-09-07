package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10,0.5));
        System.out.println(convertEurToUsd(11,0.5));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd;
        usd = eur * course;
        return usd;
    }
}
