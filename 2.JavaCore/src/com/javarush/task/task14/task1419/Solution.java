package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //1
        try {
            int i = Integer.parseInt("asd");

        } catch (Exception e) {
            exceptions.add(e);
        }
        //2

        try {
            Exception i = exceptions.get(-1);

        } catch (Exception e) {
            exceptions.add(e);
        }

        //3

        try {
            throw new NullPointerException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //4

        try {
            throw new UnsupportedOperationException ();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //5

        try {
            throw new ArrayStoreException ();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //6

        try {
            throw new ClassCastException  ();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //7

        try {
            throw new IllegalArgumentException ();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //8

        try {
            throw new NegativeArraySizeException ();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //9

        try {
            throw new IndexOutOfBoundsException ();

        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
