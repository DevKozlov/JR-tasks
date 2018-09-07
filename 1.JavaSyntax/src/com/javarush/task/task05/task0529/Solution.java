package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sInput = "0";
        int Summ = 0;

        while (!sInput.equals("сумма")) {
            Summ += Integer.parseInt(sInput);
            sInput = reader.readLine();
        }

        System.out.println(Summ);

    }
}
