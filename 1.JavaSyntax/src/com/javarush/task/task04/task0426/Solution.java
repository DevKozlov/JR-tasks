package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);

        if (nNumber > 0 && nNumber % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (nNumber > 0 && nNumber % 2 !=0) {
            System.out.println("положительное нечетное число");
        } else if (nNumber < 0 && nNumber % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (nNumber < 0 && nNumber % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
