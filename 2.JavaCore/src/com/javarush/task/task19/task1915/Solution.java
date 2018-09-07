package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArray);

        System.setOut(newPrintStream);
        testString.printSomething();
        FileOutputStream outputStream = new FileOutputStream(fileName);

        outputStream.write(byteArray.toByteArray());
        outputStream.close();
        System.setOut(defaultPrintStream);
        System.out.println(byteArray.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

