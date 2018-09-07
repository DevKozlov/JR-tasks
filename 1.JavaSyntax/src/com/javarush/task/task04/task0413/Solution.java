package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        weekDay(nNumber);
    }

    public static void weekDay(int a) {
        if (a == 1)
            System.out.println("понедельник");
        else if (a == 2)
            System.out.println("вторник");
        else if (a == 3)
            System.out.println("среда");
                    else if (a == 4)
            System.out.println("четверг");
                        else if (a == 5)
            System.out.println("пятница");
                            else if (a == 6)
            System.out.println("суббота");
                                else if (a == 7)
            System.out.println("воскресенье");
                                    else
            System.out.println("такого дня недели не существует");


    }
}