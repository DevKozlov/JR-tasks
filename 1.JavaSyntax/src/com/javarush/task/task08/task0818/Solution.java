package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Stallone", 1000);
        map.put("Puk", 1000);
        map.put("Elton", 1000);
        map.put("Jjasldf", 300);
        map.put("asfa", 300);
        map.put("asdgas", 300);
        map.put("asdf", 300);
        map.put("Stallasdgone", 300);
        map.put("Stalfasdflone", 300);
        map.put("Stallasdfasdfasdfone", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> mapBuffer = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> entry: mapBuffer.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            if (value < 500) {

                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}