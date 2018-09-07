package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    @Override
    String getDescription() {
        int N = this.getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + N + " яиц в месяц.";
    }
}