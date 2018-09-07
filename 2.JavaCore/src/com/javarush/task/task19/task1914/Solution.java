package com.javarush.task.task19.task1914;

/*
Решаем пример
*/

import java.io.ByteArrayOutputStream;
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

        int resultNumber = 0;
        String result = stream.toString();
        StringBuilder sb = new StringBuilder();
        String[] stringArray = result.split(" ");

        switch (stringArray[1]) {
            case "-": {
                resultNumber = Integer.parseInt(stringArray[0]) - Integer.parseInt(stringArray[2]);
                break;
            }
            case "*": {
                resultNumber = Integer.parseInt(stringArray[0]) * Integer.parseInt(stringArray[2]);
                break;
            }
            case "+": {
                resultNumber = Integer.parseInt(stringArray[0]) + Integer.parseInt(stringArray[2]);
                break;
            }
            default: resultNumber = 0;
        }

        sb.append(result).append(resultNumber);

        String filnalString = sb.toString();

        System.out.println(filnalString.replaceAll("\\r\\n", ""));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

