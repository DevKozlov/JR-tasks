package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;

        int n = Integer.parseInt(reader.readLine());
        int summ = 0;
        int number;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                number = Integer.parseInt(reader.readLine());
                maximum = maximum > number ? maximum : number;
            }
        }

        System.out.println(maximum);
    }
}
