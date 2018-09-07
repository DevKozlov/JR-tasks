package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> mapBuffer = new HashMap<String, String>(map);
        int count = 0;

        for (Map.Entry<String, String> pair : mapBuffer.entrySet()) {
            String value = pair.getValue();
            for (Map.Entry<String, String> pair2 : mapBuffer.entrySet()) {
                String value2 = pair2.getValue();
                if (value.equals(value2)) {
                    ++count;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, value);
            }
            count = 0;
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
