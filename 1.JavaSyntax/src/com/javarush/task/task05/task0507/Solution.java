package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double summ = 0.0;
        int count = 0;
        int Number = 0;

        while (Number != -1){
            ++count;
            summ += Number;
            Number = Integer.parseInt(reader.readLine());
        }
        System.out.println(summ/(count-1));
    }
}

