package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Ivan", 28, "Ippodromskaja 23");
        System.out.println(man1);
        Man man2 = new Man("Kirill", 28, "Ippodromskaja 23");
        System.out.println(man2);

        Woman woman = new Woman("Inna", 28, "Ippodromskaja 23");
        System.out.println(woman);
        Woman woman1 = new Woman("Sonya", 28, "Ippodromskaja 23");
        System.out.println(woman1);
    }

    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.address = address;
            this.name = name;
            this.age = age;
        }

        public Man(String name, String address) {
            this.address = address;
            this.name = name;
        }

        public String toString() {
            String name = this.name;
            int age = this.age;
            String address = this.address;
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.address = address;
            this.name = name;
            this.age = age;
        }

        public Woman(String name, String address) {
            this.address = address;
            this.name = name;
        }

        public String toString() {
            String name = this.name;
            int age = this.age;
            String address = this.address;
            return name + " " + age + " " + address;
        }
    }
}
