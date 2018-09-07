package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<String> original = new ArrayList<>();
    public static List<String> changed = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //Получим имена файлов.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader firstFileBF = new BufferedReader(new FileReader(firstFileName));
        BufferedReader secondFileBF = new BufferedReader(new FileReader(secondFileName));

        String line1 = "";
        String line2 = "";
        String line3 = "";

        boolean flag1 = true;
        boolean flag2 = true;

        while (firstFileBF.ready() || secondFileBF.ready()) {
            if (firstFileBF.ready()) {
                line1 = firstFileBF.readLine();
                original.add(line1);
            }

            if (secondFileBF.ready()) {
                line2 = secondFileBF.readLine();
                changed.add(line2);
            }
        }

        int maxLength = Math.max(original.size(), changed.size());

        int shift1 = 0;
        int shift2 = 0;

        for (int i = 0; i < maxLength; i++) {

            try {
                line1 = original.get(i + shift1);
            } catch (Exception e) {
                line1 = "";
            }

            try {
                line2 = changed.get(i + shift2);
            } catch (Exception e) {
                line2 = "";
            }

            try {
                line3 = original.get(i + shift1 + 1);
            } catch (Exception e) {
                line3 = "";
            }

            if (line1.equals("") && line2.equals("")) break;

            if (line1.equals(line2)) {
                lines.add(new LineItem(Type.SAME, line2));
                ++maxLength;
            } else if (!line1.equals(line2) && line2.equals(line3)) {
                lines.add(new LineItem(Type.REMOVED, line1));
                --shift2;
                ++maxLength;
            } else {
                lines.add(new LineItem(Type.ADDED, line2));
                --shift1;
                ++maxLength;
            }


        }



        for (int i = 0; i < lines.size(); i++) {
            System.out.print(lines.get(i).type + " ");
            System.out.println(lines.get(i).line);
        }

        firstFileBF.close();
        secondFileBF.close();
    }

    public static boolean Check(String line) {

        boolean result = false;

        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals(line)) {
                result = true;
            }
        }

        return result;
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
