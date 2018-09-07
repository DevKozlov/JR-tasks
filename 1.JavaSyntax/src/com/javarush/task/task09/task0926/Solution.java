package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] smallList1 = {1,2,3,4,5};
        int[] smallList2 = {1,2};
        int[] smallList3 = {1,2,3,4};
        int[] smallList4 = {1,2,3,4,5,6,7};
        int[] smallList5 = new int[0];

        list.add(smallList1);
        list.add(smallList2);
        list.add(smallList3);
        list.add(smallList4);
        list.add(smallList5);

        return list;
     }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
