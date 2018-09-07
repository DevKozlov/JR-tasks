package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    private String name;
    private int age;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(9);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
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
}
