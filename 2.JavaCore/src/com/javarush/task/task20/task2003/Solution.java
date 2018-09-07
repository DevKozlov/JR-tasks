package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static BufferedReader br;
    String fileName;
    InputStream inpStr;
    Properties propert;
    Set<String> propKeys;

    public void fillInPropertiesMap() {
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = br.readLine();
            inpStr= new FileInputStream(fileName);
            load(inpStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        propert = new Properties();
        for (Map.Entry<String, String> pair : properties.entrySet()){
            propert.setProperty(pair.getKey(), pair.getValue());
        }
        propert.store(outputStream,"");

    }

    public void load(InputStream inputStream) throws Exception {
        propert = new Properties();
        propert.load(inputStream); // загружаю в объект props значения из потока, связанного с файлом
        propKeys = propert.stringPropertyNames(); // получение всех ключей за объекта props
        for (String s : propKeys){ // заполнение карты properties
            properties.put(s, propert.getProperty(s));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.fillInPropertiesMap();
//        ======================== test=====================
        for (Map.Entry<String, String> pair : properties.entrySet()){
            System.out.println(pair.getKey() + "---" + pair.getValue());
        }
// ========================= save test =====================
        try {
            OutputStream outputStream = new FileOutputStream("C:/temp/2.txt");
            solution.save(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
