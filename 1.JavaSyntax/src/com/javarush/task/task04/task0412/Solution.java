package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        nAbs(nNumber);

    }

    public static void nAbs(int a) {
        int b=0;
        if (a>0)
            b = a * 2;
        if (a<0)
            b = a + 1;
        if (a==0)
            b = 0;
        System.out.println(b);

    }

}