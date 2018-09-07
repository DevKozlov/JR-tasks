package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }
    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
        threads.get(1).interrupt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threads.get(3).isAlive());
    }

    public static class Thread1 implements Runnable {
        @Override
        public void run() {
            while(true) {

            }
        }
    }

    public static class Thread2 implements Runnable {
        @Override
        public void run() {
            while(true) {
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class Thread3 implements Runnable {
        @Override
        public void run() {
            while(true) {
                try {
                    System.out.println("Ура");
                    Thread.currentThread().sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        private boolean isCancel = false;
        @Override
        public void showWarning() {
            this.isCancel = true;
        }

        @Override
        public void run() {
            while (!isCancel){}
        }
    }

    public static class Thread5 implements Runnable {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string;
            int summ = 0;
            while (true) {
                try {
                    string = reader.readLine();
                    if(string.equals("N")) {
                        System.out.println(summ);
                        summ = 0;
                        return;
                    }
                    summ += Integer.parseInt(string);
                } catch (Exception e) {

                }

            }
        }
    }
}