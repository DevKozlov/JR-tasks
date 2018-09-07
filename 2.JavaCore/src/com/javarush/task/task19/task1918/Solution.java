package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    private static int stepOver = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append((char)fileReader.read());
        }
        fileReader.close();
        String fileString = sb.toString().replaceAll("<"+args[0]+"\\r", "<"+args[0]+" ");

        fileString = fileString.replaceAll("\\r\\n", "").replaceAll("\\n"," ").replaceAll("\\r", "").replaceAll("\\s{2,}", " ");

      //  System.out.println(fileString);


      //  System.out.println(fileString);

        Pattern pattern = Pattern.compile("<"+args[0]);
        Matcher matcher = pattern.matcher(fileString);


        while (matcher.find()) {
//            if (stepOver > 0) {
//                --stepOver;
//                continue;
//            }
            System.out.println(FindEnd(fileString.substring(matcher.start()), args[0]));
        }
    }

    public static String FindEnd(String string, String tag) {


        String result;
        int countOfTag = 0;
        int startIndex = 0;
        int endIndex = 0;
        int curStatus;

        Pattern pattern1 = Pattern.compile("(<"+tag+").*?(</"+ tag +">)");
        Matcher matcher1 = pattern1.matcher(string);
        matcher1.find();

        String workString = string.substring(matcher1.start(),matcher1.end());

        while (true) {
            curStatus = workString.indexOf("<"+tag,startIndex);
            if(curStatus != -1) {
                ++countOfTag;
                startIndex = curStatus + ("<"+tag).length();
            } else break;
        }

        stepOver = countOfTag-1;

        for (int i = 0; i < countOfTag; i++) {
            curStatus = string.indexOf("</" + tag + ">", endIndex);
            endIndex = curStatus + ("</" + tag + ">").length();
        }

        result = string.substring(0, endIndex);

        return result;
    }
}
