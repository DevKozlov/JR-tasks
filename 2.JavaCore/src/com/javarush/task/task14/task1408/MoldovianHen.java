package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }
    @Override
    String getDescription() {
        int N = this.getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + N + " яиц в месяц.";
    }
}