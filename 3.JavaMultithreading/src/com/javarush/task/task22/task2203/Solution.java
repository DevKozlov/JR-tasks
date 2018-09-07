package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws Exception{
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] stringArray = string.split("\\t");
        String result = null;
        try {
            result =  stringArray[2];
            result = stringArray[1];
        } catch (Exception e) {
            throw new TooShortStringException(e);
        }
        return result;

    }

    public static class TooShortStringException extends Exception {
        public TooShortStringException(Throwable message) {
            super(message);
        }

        public TooShortStringException() {
        }
    }

    public static void main(String[] args) throws TooShortStringException, Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
