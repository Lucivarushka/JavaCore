package com.daria.javacore.chapter03;

public class LifeTime {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y равна: " + y);
            y = 100;
            System.out.println("y теперь равна: " + y);
        }
    }
}
