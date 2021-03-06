package com.javarush.task.task20.task2026;

import java.util.ArrayList;
import java.util.List;

/*
Алгоритмы-прямоугольники
*/
public class Solution {
    static List<Rectangle> rectangles;

    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");

        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }
    public static class Rectangle {
        int iBegin, iEnd, jBegin, jEnd;
        int lenth, height;


        public Rectangle(int iBegin, int iEnd, int jBegin, int jEnd) {
            this.iBegin = iBegin;
            this.iEnd = iEnd;
            this.jBegin = jBegin;
            this.jEnd = jEnd;
        }
        @Override
        public String toString() {
            return "Rectangle " + iBegin + " " + iEnd + " / " + jBegin + " " + jEnd;
        }

    }

    private static boolean rectangleExists(int i, int j) {
        for (Rectangle rectangle : rectangles) {
            if ((i >= rectangle.iBegin && i <= rectangle.iEnd) && (j >= rectangle.jBegin && j <= rectangle.jEnd)) {
                return true;
            }
        }
        return false;
    }

    private static void createNewRectange (int i, int j, byte[][] testedArray) {
        int iEnd = i, jEnd = j;

        for (int lenIndex = i; lenIndex < testedArray[j].length; lenIndex++) {
            if (testedArray[j][lenIndex] == 0) {
                iEnd = lenIndex - 1;
                break;
            }
            if (lenIndex == testedArray[j].length - 1)
                iEnd = testedArray[j].length - 1;
        }

        for (int heightIndex = j; heightIndex < testedArray.length; heightIndex++) {
            if (testedArray[heightIndex][i] == 0) {
                jEnd = heightIndex - 1;
                break;
            }
            if (heightIndex == testedArray.length - 1)
                jEnd = testedArray.length - 1;
        }

        rectangles.add(new Rectangle(i, iEnd, j, jEnd));
    }



    public static int getRectangleCount(byte[][] a) {
        rectangles = new ArrayList<>();
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
                if (a[j][i] == 1)
                    if(!rectangleExists(i,j)) {
                        createNewRectange(i, j, a);
                    }
            }
        }
        return rectangles.size();
    }
}
