package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human();


        Human grandFather2 = new Human();
        Human grandMother1 = new Human();
        Human grandMother2 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();

        grandFather1.name = "Иван";
        grandFather1.age = 80;
        grandFather1.sex = true;
        grandFather1.children.add(father);

        grandFather2.name = "Иван";
        grandFather2.age = 80;
        grandFather2.sex = true;
        grandFather2.children.add(mother);

        grandMother1.name = "Инна";
        grandMother1.age = 80;
        grandMother1.sex = false;
        grandMother1.children.add(father);

        grandMother2.name = "Инна";
        grandMother2.age = 80;
        grandMother2.sex = false;
        grandMother2.children.add(mother);

        father.name = "Иван";
        father.age = 80;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.name = "Инна";
        mother.age = 80;
        mother.sex = false;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        child1.name = "Инна";
        child1.age = 80;
        child1.sex = true;

        child2.name = "Инна";
        child2.age = 80;
        child2.sex = true;

        child3.name = "Инна";
        child3.age = 80;
        child3.sex = true;

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        System.out.println(mother.toString());
        System.out.println(father.toString());

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());

        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
