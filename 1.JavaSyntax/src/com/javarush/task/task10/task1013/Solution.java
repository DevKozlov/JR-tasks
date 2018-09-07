package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private int height;
        private boolean sex;
        private String country;

        public Human() {

        }

        public Human(int age) {
           this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String country, String name) {
            this.country = country;
            this.name = name;
        }

        public Human(int age, int weight, int height) {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(boolean sex, int age) {
            this.sex = sex;
            this.age = age;
        }

        public Human(boolean sex, int age, String name) {
            this.sex = sex;
            this.age = age;
            this.name = name;
        }

        public Human(boolean sex, int age, int weight) {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(boolean sex, int age, int weight, int height) {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

    }
}
