package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSecondsAfter15(23456));
    }

    public static int getSecondsAfter15(int seconds) {
        int kSec = 3600*3;
        return seconds - kSec;
    }
}