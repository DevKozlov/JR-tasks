package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {


    public static void main(String[] args) {
        List<Word> list;

        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        list = detectAllWords(crossword, "home", "same");
        for (Word elem : list) {
            System.out.println(elem);
        }
        System.out.println(list.size());

        System.out.println("===================================");

        list = detectAllWords(crossword, "masu", "vorg");

        for (Word elem : list) {
            System.out.println(elem);
        }
        System.out.println(list.size());
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word>list = new ArrayList<>();
        int M = crossword.length; //количество столбцов
        int N = crossword[0].length; // количество строк
        char[][] chars = new char[words.length][];
        //System.out.println(M + " " + N);
        //System.out.println(words.length);
        for (int i = 0; i < words.length; i++) {
            //System.out.println(i);
            chars[i] = words[i].toCharArray();
        }

        for (int a = 0; a < M; a++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < chars.length; k++) {
                    if (crossword[a][j] == chars[k][0]) {
                        int indI = a, indJ = j, indW = k;
                        if (chars[k].length == 1) {
                            Word word = new Word(new String(chars[indW]));
                            word.setStartPoint(indJ, indI);
                            word.setEndPoint(indJ, indI);
                            list.add(word);
                        } else {
                            for (int c = 0; c < 8; c++) {
                                boolean equal;

                                switch (c) {
                                    //вправо
                                    case 0:
                                        if (indJ + chars[indW].length > crossword[0].length) break;
                                        //System.out.println(indI + chars[indW].length + " " + crossword[0].length);
                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI][indJ + i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ + chars[indW].length - 1, indI);
                                            list.add(word);
                                        }
                                        break;
                                    //вправо и вниз
                                    case 1:
                                        if (indJ + chars[indW].length > crossword[0].length) break;
                                        if (indI + chars[indW].length > crossword.length) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI + i][indJ + i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ + chars[indW].length - 1,
                                                    indI + chars[indW].length - 1);
                                            list.add(word);
                                        }
                                        break;
                                    //вниз
                                    case 2:
                                        if (indI + chars[indW].length > crossword.length) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI + i][indJ]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ, indI + chars[indW].length - 1);
                                            list.add(word);
                                        }
                                        break;
                                    //влево и вниз
                                    case 3:
                                        if (indJ + 1 - chars[indW].length < 0) break;
                                        if (indI + chars[indW].length > crossword.length) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI + i][indJ - i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ - chars[indW].length + 1,
                                                    indI + chars[indW].length - 1);
                                            list.add(word);
                                        }
                                        break;
                                    //влево
                                    case 4:
                                        if (indJ + 1 - chars[indW].length < 0) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI][indJ - i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ - chars[indW].length + 1, indI);
                                            list.add(word);
                                        }
                                        break;
                                    //влево и вверх
                                    case 5:
                                        if (indJ + 1 - chars[indW].length < 0) break;
                                        if (indI + 1 - chars[indW].length < 0) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI - i][indJ - i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ - chars[indW].length + 1,
                                                    indI - chars[indW].length + 1);
                                            list.add(word);
                                        }
                                        break;
                                    //вверх
                                    case 6:
                                        if (indI + 1 - chars[indW].length < 0) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI - i][indJ]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ, indI - chars[indW].length + 1);
                                            list.add(word);
                                        }
                                        break;
                                    //вправо и вверх
                                    case 7:
                                        if (indJ + chars[indW].length > crossword[0].length) break;
                                        if (indI + 1 - chars[indW].length < 0) break;

                                        equal = true;
                                        for (int i = 1; i < chars[indW].length; i++) {
                                            if (chars[indW][i] != crossword[indI - i][indJ + i]) {
                                                equal = false;
                                                break;
                                            }
                                        }
                                        if (equal) {
                                            Word word = new Word(new String(chars[indW]));
                                            word.setStartPoint(indJ, indI);
                                            word.setEndPoint(indJ + chars[indW].length - 1,
                                                    indI - chars[indW].length + 1);
                                            list.add(word);
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }

        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
