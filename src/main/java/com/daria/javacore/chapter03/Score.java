package com.daria.javacore.chapter03;

public class Score {
    public static void main(String args[]) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! y не известна в этой области определения
        // переменная x известна и здесь.
        System.out.println("x равна " + x);
    }
}
