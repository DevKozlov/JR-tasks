package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        String[] argsBlock1 = new String[4];
        String[] argsBlock2 = new String[5];
        String[] argsBlock34 = new String[2];
        if (args.length > 0) {
            switch(args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        argsBlock1[0] = args[0];
                        for (int i = 1; i < args.length; i++) {
                            if (i%3 == 0) {
                                System.arraycopy(args,i-2, argsBlock1, 1,3);
                                selectParam(argsBlock1);
                            }
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        argsBlock2[0] = args[0];
                        for (int i = 1; i < args.length; i++) {
                            if (i % 4 == 0) {
                                System.arraycopy(args, i - 3, argsBlock2, 1, 4);
                                selectParam(argsBlock2);
                            }
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        argsBlock34[0] = args[0];
                        for (int i = 1; i < args.length; i++) {
                            System.arraycopy(args, i, argsBlock34, 1, 1);
                            selectParam(argsBlock34);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        argsBlock34[0] = args[0];
                        for (int i = 1; i < args.length; i++) {
                            System.arraycopy(args, i, argsBlock34, 1, 1);
                            selectParam(argsBlock34);
                        }
                    }
                    break;
                default:
                    synchronized (allPeople) {
                        System.out.println("Неизвестный параметр №1.");
                        break;
                    }
            }

        } else System.out.println("Не заданы параметры.");


    }

    public static void selectParam(String[] args) {
        int id;
        Person currentPerson;
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy", Locale.ENGLISH);
        if (args.length > 0) {
            switch(args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        if (!(args.length == 4)) {
                            System.out.println("Неверное количество параметров.");
                            break;
                        }
                        if (args[2].equals("ж")) {
                            try {
                                allPeople.add(Person.createFemale(args[1], ft.parse(args[3])));
                                System.out.println(allPeople.size() - 1);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else if (args[2].equals("м")) {
                            try {
                                allPeople.add(Person.createMale(args[1], ft.parse(args[3])));
                                System.out.println(allPeople.size() - 1);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else System.out.println("Неверный параметр №2.");
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        if (!(args.length == 5)) {
                            System.out.println("Неверное количество параметров.");
                            break;
                        }
                        try {
                            id = Integer.parseInt(args[1]);
                            if (args[3].equals("ж")) {
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
                    }
                case "-d":
                    synchronized (allPeople) {
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
                    }
                case "-i":
                    synchronized (allPeople) {
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
                        break;
                    }
                default:
                    synchronized (allPeople) {
                        System.out.println("Неизвестный параметр №1.");
                        break;
                    }
            }
        }
    }
}
