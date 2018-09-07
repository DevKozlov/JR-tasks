package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка ввода данных.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
            }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private BufferedReader reader;


        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            StringBuffer sb = new StringBuffer();

            try {
                if (reader.ready()) {

                    try {
                        while (reader.ready()) {
                            sb.append(reader.readLine());
                            sb.append(" ");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                return "";
            }

            return sb.toString();
        }

        @Override
        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
