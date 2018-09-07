package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);
        int nNumber3 = Integer.parseInt(sNumber3);

        if (nNumber1 == nNumber2 && nNumber1 != nNumber3)
            System.out.println("3");
        if (nNumber2 == nNumber3 && nNumber2 != nNumber1)
            System.out.println("1");
        if (nNumber3 == nNumber1 && nNumber1 != nNumber2)
            System.out.println("2");
    }
}
