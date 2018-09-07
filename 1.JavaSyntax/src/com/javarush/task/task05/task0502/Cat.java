package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int rank = 0;
        if (this.strength > anotherCat.strength)
            ++rank;
        if (this.weight > anotherCat.weight)
            ++rank;
        if (rank >= 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Vasya";
        cat1.age = 10;
        cat1.strength = 9;
        cat1.weight = 5;

        cat2.name = "Boris";
        cat2.age = 9;
        cat2.strength = 8;
        cat2.weight = 5;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
