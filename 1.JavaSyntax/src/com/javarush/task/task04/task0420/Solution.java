package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.lang.reflect.Array;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        String sNumber2 = reader.readLine();
        String sNumber3 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        int nNumber2 = Integer.parseInt(sNumber2);
        int nNumber3 = Integer.parseInt(sNumber3);
        decrease(nNumber1, nNumber2, nNumber3);
    }

    public static void decrease(int a, int b, int c) {
        int mid;
        if (c > a){
            mid = c;
            c = a;
            a = mid;
        }

        if (b > a){
            mid = b;
            b = a;
            a = mid;
        }

        if (c > b){
            mid = b;
            b = c;
            c = mid;
        }
        System.out.println(a + " " + b + " " + c);
    }


}
