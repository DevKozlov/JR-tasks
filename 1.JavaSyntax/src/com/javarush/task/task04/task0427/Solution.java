package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        int count = 0;
        
        if (nNumber % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (nNumber % 2 != 0) {
            System.out.println("положительное четное число");
        }
    }
}
