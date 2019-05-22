package com.daria.CrossZero;

public class Field {
    public static final char VALUE_GAMER1 = 'X';
    public static final char VALUE_GAMER2 = 'O';
    private static char[][] playingField = new char[][]{
            {'*', '*', '*'},
            {'*', '*', '*'},
            {'*', '*', '*'}};

    public char[][] getPlayingField() {
        return playingField;
    }

    public static void printField() {
        int one = 0;
        System.out.println("Game field:");
        System.out.println("  0 1 2");
        for (int i = 0; i < playingField.length; i++) {
            System.out.print(one++ + " ");
            for (int j = 0; j < playingField.length; j++) {
                System.out.print(playingField[i][j] + " ");
            }
            System.out.println();
        }
    }
}