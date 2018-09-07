package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    private String name;
    private int age;
    private char sex;

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Buddy");
        person.setAge(9);
        person.setSex('m');

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
