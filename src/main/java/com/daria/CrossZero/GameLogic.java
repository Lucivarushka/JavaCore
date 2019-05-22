package com.daria.CrossZero;

import java.util.Scanner;

import static com.daria.CrossZero.Field.VALUE_GAMER1;
import static com.daria.CrossZero.Field.VALUE_GAMER2;

public class GameLogic {
    public static int movesPlayer = 1;
    private static final int MAX_MOVES = 3;

    public void startGame() {
        System.out.println("Welcome!");
        try {
            while (true) {
                Field.printField();
                if (movesPlayer % 2 != 0) {
                    System.out.println("Player 1 (X). Move number - " + movesPlayer + ". Player, select row and turn column");
                } else {
                    System.out.println("Player 2 (O). Move number - " + movesPlayer + ". Player, select row and turn column");
                }
                System.out.println("Enter value row:");
                Scanner scanner = new Scanner(System.in);
                int row = readInt(scanner);
                System.out.println("Enter value column:");
                int column = readInt(scanner);
                checkField(row, column);
                if (checkWin(VALUE_GAMER1)) {
                    Field.printField();
                    System.out.println("Player 1(X) won");
                    break;
                } else if (checkWin(VALUE_GAMER2)) {
                    Field.printField();
                    System.out.println("Player 2(O) won");
                    break;
                } else if (isFreePlace()) {
                    System.out.println("Draw!");
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of range");
        }
    }

    private static int readInt(Scanner scanner) {
        boolean validInput = false;
        int number = -1;
        while (!validInput) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0 && number <= 2) {
                    break;
                } else {
                    System.out.println("Enter value 0-2");
                }
            } else {
                System.out.println("Wrong value. Please repeat!");
                scanner.next();
                validInput = false;
            }
        }
        return number;
    }

    private static boolean isFreePlace() {
        Field field = new Field();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field.getPlayingField()[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkLine(int start_x, int start_y, int dx, int dy, char sign) {
        Field field = new Field();
        for (int i = 0; i < MAX_MOVES; i++) {
            if (field.getPlayingField()[start_x + i * dx][start_y + i * dy] != sign) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char sign) {
        for (int i = 0; i < MAX_MOVES; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, sign)) {
                return true;
            }
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, sign)) {
                return true;
            }
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, sign)) {
            return true;
        }
        if (checkLine(0, MAX_MOVES - 1, 1, -1, sign)) {
            return true;
        }
        return false;
    }

    private void checkField(int row, int column) {
        Field field = new Field();
        if (field.getPlayingField()[row][column] == '*') {
            moveGamer(row, column, VALUE_GAMER1, VALUE_GAMER2);
        } else {
            System.out.println("Enter another value");
        }
    }

    private static void moveGamer(int row, int column, char value, char value1) {
        Field field = new Field();
        if (GameLogic.movesPlayer % 2 != 0) {
            GameLogic.movesPlayer++;
            field.getPlayingField()[row][column] = value;
        } else if (GameLogic.movesPlayer % 2 == 0) {
            GameLogic.movesPlayer++;
            field.getPlayingField()[row][column] = value1;
        }
    }
}