package com.javarush.task.task05.task0528;

import java.util.Date;
import java.text.SimpleDateFormat;
/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date today = new Date();
        String sDay = "dd";
        String sMonth = "MM";
        String sYear = "Y";

        SimpleDateFormat sdfDay = new SimpleDateFormat(sDay);
        SimpleDateFormat sdfMonth = new SimpleDateFormat(sMonth);
        SimpleDateFormat sdfYear = new SimpleDateFormat(sYear);

        System.out.println(sdfDay.format(today) + " " + sdfMonth.format(today) + " " + sdfYear.format(today));
    }
}
