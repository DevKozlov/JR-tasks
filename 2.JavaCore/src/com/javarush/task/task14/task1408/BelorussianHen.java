package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    String getDescription() {
        int N = this.getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + N + " яиц в месяц.";
    }
}
