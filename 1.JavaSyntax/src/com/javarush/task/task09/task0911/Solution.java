package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
        HashMap<String, String> map = new HashMap<String, String>(null);


        try{
        map.put(null, null);} catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            map.remove(null);}
            catch (NullPointerException e) {
                System.out.println(e);
            } }  catch (NullPointerException e) {
            System.out.println(e);}

        //напишите тут ваш код
    }
}
