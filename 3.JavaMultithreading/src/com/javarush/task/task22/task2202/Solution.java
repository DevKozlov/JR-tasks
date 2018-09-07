package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string)
    {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] stringArray = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            try {
                sb.append(stringArray[i]);
                if (i<4) {
                    sb.append(" ");
                }
            } catch (Exception e) {
                throw new TooShortStringException(e);
            }
        }
        return sb.toString();
    }

    public static class TooShortStringException extends RuntimeException{
        public TooShortStringException(Throwable message) {
            super(message);
        }


        public TooShortStringException() {
        }
    }
}
