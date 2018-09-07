package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.NativeString.trim;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
//        String line;
//        Pattern p = Pattern.compile(".*\\D\\D");
//        Pattern n = Pattern.compile("\\d.*");
        Matcher m;
//        String name;
//        Date date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
//        String buf;

        while (reader.ready()) {
            m = Pattern.compile("([-А-Яа-яA-Za-z\\s]+)\\s([0-9]{1,2}\\s[0-9]{1,2}\\s[0-9]{4})").matcher(reader.readLine());
            if (m.find()) {

                String name = m.group(1);
                String date = m.group(2);

                PEOPLE.add(new Person(name,dateFormat.parse(date)));
        }
        }

        reader.close();

        for (int i = 0; i < PEOPLE.size(); i++) {
            System.out.println(PEOPLE.get(i).getName() + " " + PEOPLE.get(i).getBirthday());
        }
    }

}
