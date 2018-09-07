package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution implements Serializable {
    public A getOriginalObject(ObjectInputStream objectStream) throws Exception {
        try {
            A a = (A) objectStream.readObject();
            if (a.getClass().getSimpleName().equals("A")) {
                return a;
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            //e.getStackTrace();
            System.out.println("It's not A");
            return null;
        }
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
