package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
*/

import static java.lang.Thread.sleep;

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try { sleep(100);}
            catch (InterruptedException e) {}
        }
    }
}
