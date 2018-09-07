package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread test = new TestThread();
        test.start();
        Thread.sleep(5000);
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        private int count = 0;

        public void run() {
            while (true) {
                System.out.println(count);
                ++count;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
        }
    }
}