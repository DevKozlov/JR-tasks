package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackEntity = Thread.currentThread().getStackTrace();
        System.out.println(stackEntity[2].getClassName() + ": " + stackEntity[2].getMethodName() + ": " + s);
    }
}
