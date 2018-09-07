package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        String sNumber4 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);
        int nNumber3 = Integer.parseInt(sNumber3);
        int nNumber4 = Integer.parseInt(sNumber4);
        maximun(nNumber1, nNumber2, nNumber3, nNumber4);
    }

    public static void maximun(int a, int b, int c, int d) {
        System.out.println(maximun(maximun(a,b),maximun(c,d)));
    }

    public static int maximun (int a, int b) {
        if (a>b)
            return a;
        else
            return b;
    }

}
