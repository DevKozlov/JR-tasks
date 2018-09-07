package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!((s=reader.readLine()).equals("exit"))) {
            try {
                int i = Integer.parseInt(s); // сначала пробуешь спарсить целое число, если не ловишь except
                if( i > 0 && i < 128) {
                    print((short)i); // то проверяешь - а вдруг это целое число влезает в short??
                } else print(i); // если не влезает, то ничего страшного , печатаем как int
            }
            catch(NumberFormatException e) {
                try {
                    double d = Double.parseDouble(s); // опа, словили except, значит пробуем спарсить double
                    print(d);
                }
                catch(NumberFormatException ee) {
                    print(s); // ну если мы уже второй раз словили except, то выводим как String
                }
            }
        }

    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
