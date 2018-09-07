package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date newDate = new Date(date);
        Date baseDate = new Date(date);
        baseDate.setMonth(0);
        baseDate.setDate(1);
        long days = newDate.getTime() - baseDate.getTime();
        days = days / (24*60*60*1000) + 1;
        System.out.println(days);
        if (days % 2 != 0)
            return true;
        else
            return false;
    }
}
