package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome implements Runnable{
    private List<Horse> horses;
    static Hippodrome game;

    public static void main(String[] args) {

        Horse horse1 = new Horse("Sivka", 3, 0);
        Horse horse2 = new Horse("Burka", 3, 0);
        Horse horse3 = new Horse("Sivka", 3, 0);

        List<Horse> horses = new ArrayList();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public Horse getWinner() {
        Horse horse = new Horse();
        double max =0;
        for (int i = 0; i < horses.size(); i++) {
            if(max < horses.get(i).getDistance()) {
                max = horses.get(i).getDistance();
                horse = horses.get(i);
            }
        }
        return horse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName()  + "!");
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

            public void print() {
                for (int i = 0; i < horses.size(); i++) {
                    horses.get(i).print();
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println();
                }
            }

            public void move() {
                for (int i = 0; i < horses.size(); i++) {
                    horses.get(i).move();
                }
            }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
