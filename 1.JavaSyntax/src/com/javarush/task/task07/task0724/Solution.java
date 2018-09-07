package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human man1 = new Human("Ivan", true, 28);
        Human man2 = new Human("Alex", true, 29);
        Human man3 = new Human("Nikita", true, 30);
        Human man4 = new Human("Grigoryy", true, 31);
        Human man5 = new Human("Ivan", true, 32, man1, man2);
        Human man6 = new Human("Alex", true, 33, man3, man4);
        Human man7 = new Human("Nikita", true, 34, man1, man2);
        Human man8 = new Human("Grigoryy", true, 35, man3, man4);
        Human man9 = new Human("Sancho", true, 36, man3, man4);

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
        System.out.println(man4);
        System.out.println(man5);
        System.out.println(man6);
        System.out.println(man7);
        System.out.println(man8);
        System.out.println(man9);
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















