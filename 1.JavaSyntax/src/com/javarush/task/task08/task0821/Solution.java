package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Козлов","Иван");

        map.put("Козлов","Алексей");
        map.put("Живаго","Денис");
        map.put("Непомнящий","Иван");
        map.put("Ершова","Марина");
        map.put("Перкова","Анастасия");
        map.put("Щур","София");
        map.put("Головин","Кирилл");
        map.put("Гаврилко","Кирилл");
        map.put("Шатров","Григорий");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
