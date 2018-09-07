package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> lMap = new HashMap<String, String>();
        lMap.put("Козлов","Иван");
        lMap.put("Николаев","Алексей");
        lMap.put("Поляков","Иван");
        lMap.put("Головин","Иван");
        lMap.put("Щур","Иван");
        lMap.put("Голованов","Иван");
        lMap.put("Пирожков","Иван");
        lMap.put("Залупченко","Иван");
        lMap.put("Гнездов","Иван");
        lMap.put("Пукин","Иван");
        return lMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> entry: map.entrySet()) {
            String value = entry.getValue();
            if (value.equals(name)) {
                ++count;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            if (key.equals(lastName)) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        HashMap<String, String> lMap = createMap();
//        System.out.println(getCountTheSameFirstName(lMap,"Иван"));
//        System.out.println(getCountTheSameLastName(lMap, "Козлов"));
    }

}
