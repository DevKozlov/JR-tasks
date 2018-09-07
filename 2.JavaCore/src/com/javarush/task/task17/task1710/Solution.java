package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        int id;
        Person currentPerson;
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy", Locale.ENGLISH);
        if (args.length > 0) {
            switch(args[0]) {
                case "-c":
                    if (!(args.length == 4)) {
                        System.out.println("Неверное количество параметров.");
                        break;
                    }
                    if(args[2].equals("ж")) {
                        try {
                            allPeople.add(Person.createFemale(args[1], ft.parse(args[3])));
                            System.out.println(allPeople.size()-1);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else if (args[2].equals("м")) {
                        try {
                            allPeople.add(Person.createMale(args[1], ft.parse(args[3])));
                            System.out.println(allPeople.size()-1);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else System.out.println("Неверный параметр №2.");
                    break;
                case "-u":
                    if (!(args.length == 5)) {
                        System.out.println("Неверное количество параметров.");
                        break;
                    }
                    try {
                        id = Integer.parseInt(args[1]);
                        if(args[3].equals("ж")) {
                            try {
                                allPeople.set(id, Person.createFemale(args[2], ft.parse(args[4])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else if (args[3].equals("м")) {
                            try {
                                allPeople.set(id, Person.createMale(args[2], ft.parse(args[4])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else System.out.println("Неверный параметр №3.");
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный параметр №2.");
                    }
                    break;
                case "-d":
                    if (!(args.length == 2)) {
                        System.out.println("Неверное количество параметров.");
                        break;
                    }
                    try {
                        id = Integer.parseInt(args[1]);
                        try {
                            currentPerson = allPeople.get(id);
                            currentPerson.setName(null);
                            currentPerson.setSex(null);
                            currentPerson.setBirthDay(null);
                            allPeople.set(id, currentPerson);
                        } catch (Exception e) {
                            System.out.println("По данному id нет человека.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный параметр №2.");
                    }

                    break;
                case "-i":
                    if (!(args.length == 2)) {
                        System.out.println("Неверное количество параметров.");
                        break;
                    }
                    try {
                        id = Integer.parseInt(args[1]);
                        try {
                            currentPerson = allPeople.get(id);
                            System.out.println(currentPerson.getName() + " " + (currentPerson.getSex().equals(Sex.FEMALE) ? "ж" : "м") + " " + format.format(currentPerson.getBirthDay()));
                        } catch (Exception e) {
                            System.out.println("По данному id нет человека.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный параметр №2.");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Неизвестный параметр №1.");
                    break;
            }
        }

    }
}
