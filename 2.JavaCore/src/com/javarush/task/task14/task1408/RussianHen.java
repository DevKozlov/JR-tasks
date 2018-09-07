package com.javarush.task.task14.task1408;

class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }
    @Override
    String getDescription() {
        int N = this.getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + N + " яиц в месяц.";
    }
}
