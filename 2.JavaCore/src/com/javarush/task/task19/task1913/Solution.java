package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream outputStream = new PrintStream(stream);

        System.setOut(outputStream);

        testString.printSomething();

        System.setOut(printStream);

        String result = stream.toString();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < result.length(); i++) {
            if (Character.isDigit(result.charAt(i))) {
                sb.append(result.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
