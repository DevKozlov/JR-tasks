package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("DECEMBER 1 1980"));
        map.put("Puk", new Date("JUNE 1 1980"));
        map.put("Elton", new Date("JUNE 1 1980"));
        map.put("Jjasldf", new Date("JUNE 1 1980"));
        map.put("asfa", new Date("JUNE 1 1980"));
        map.put("asdgas", new Date("JUNE 1 1980"));
        map.put("asdf", new Date("SEPTEMBER 1 1980"));
        map.put("Stallasdgone", new Date("JUNE 1 1980"));
        map.put("Stalfasdflone", new Date("JUNE 1 1980"));
        map.put("Stallasdfasdfasdfone", new Date("JANUARY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> mapBuffer = new HashMap<>(map);
        for (HashMap.Entry<String, Date> entry: mapBuffer.entrySet()) {
            Date value = entry.getValue();
            String key = entry.getKey();
            int month = value.getMonth();
            if ((month >= 5) && (month <= 7)) {

                map.remove(key);
            }
        }

    }

    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//
//        removeAllSummerPeople(map);
//
//        for (HashMap.Entry<String, Date> mapout : map.entrySet()) {
//            String name = mapout.getKey();
//            System.out.println(name);
//        }
    }
}
