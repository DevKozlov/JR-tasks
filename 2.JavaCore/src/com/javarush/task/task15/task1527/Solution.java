package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n;
        String params;
        String [] paramsList;
        String [] paramsExpressions;
        String sObj = null;
        try {
            n = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            n = null;
        }
        if (n != null) {
            try {
                params = n.split("\\?")[1];
            } catch (Exception e) {
                System.out.println("В данной строке нет параметров.");
                params = null;
            }
            if (params != null) {
                paramsList = params.split("&");
                if (paramsList.length != 0) {
                    for (int i = 0; i < paramsList.length; i++) {
                        paramsExpressions = paramsList[i].split("=");
                        System.out.print(paramsExpressions[0] + " ");
                        if (paramsExpressions.length == 2) {
                            if(paramsExpressions[0].equals("obj")) {
                                sObj = paramsExpressions[1];
                            }
                        }
                    }
                }
            }

        }
        if (sObj != null) {
            System.out.println();
            try {
                alert(Double.parseDouble(sObj));
            } catch (NumberFormatException e) {
                alert(sObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
