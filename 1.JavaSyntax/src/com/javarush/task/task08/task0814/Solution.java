package com.javarush.task.task08.task0814;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> setN = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            setN.add(i);
        }
        return setN;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> setN = new HashSet<Integer>(set);
        for (Integer number: setN) {
            if (number > 10) {
                set.remove(number);
            }
        }


        set.retainAll(setN);
        return set;
    }

    public static void main(String[] args) {
//        for (Integer number : removeAllNumbersMoreThan10(createSet())) {
//            System.out.println(number);
//        }

    }
}
