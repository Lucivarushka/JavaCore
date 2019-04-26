package com.daria.CrossZero;

import java.util.Scanner;

import static com.daria.CrossZero.Field.playingField;

public class GameLogic {
    private int movesPlayer = 1;
    private boolean gameOver = false;

    public void startGame() {
        System.out.println("Welcome!");
        try {
            while (gameOver == false) {
                Field.printField();
                if (movesPlayer % 2 != 0) {
                    System.out.println("Player 1 (X). Move number - " + movesPlayer + ". Player, select row and turn column");
                } else {
                    System.out.println("Player 2 (O). Move number - " + movesPlayer + ". Player, select row and turn column");
                }
                System.out.println("Enter value row:");
                Scanner scanner = new Scanner(System.in);
                int row = scanner.nextInt();
                System.out.println("Enter value column:");
                int column = scanner.nextInt();
                checkField(row, column);
                gameOver = checkGame(gameOver);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of range");
        }

        if (gameOver == true) {
            Field.printField();
            if (movesPlayer < 9) {
                if (movesPlayer % 2 == 0) {
                    System.out.println("Player 1(X) won");
                } else {
                    System.out.println("Player 2(O) won");
                }
            } else {
                System.out.println("Draw!");
            }
            System.out.println("Game over!");
        }
    }

    private boolean checkGame(boolean gameOver) {
        if (movesPlayer > 9) {
            gameOver = true;
        } else if (movesPlayer > 5) {
            if ((playingField[0][0] == playingField[0][1]) && (playingField[0][1] == playingField[0][2]) && (playingField[0][0] != '*')) {
                gameOver = true;
            } else if ((playingField[1][0] == playingField[1][1]) && (playingField[1][1] == playingField[1][2]) && (playingField[1][1] != '*')) {
                gameOver = true;
            } else if ((playingField[2][0] == playingField[2][1]) && (playingField[2][1] == playingField[2][2]) && (playingField[2][2] != '*')) {
                gameOver = true;
            } else if ((playingField[0][0] == playingField[1][0]) && (playingField[1][0] == playingField[2][0]) && (playingField[0][0] != '*')) {
                gameOver = true;
            } else if ((playingField[0][1] == playingField[1][1]) && (playingField[1][1] == playingField[2][1]) && (playingField[1][1] != '*')) {
                gameOver = true;
            } else if ((playingField[0][2] == playingField[1][2]) && (playingField[1][2] == playingField[2][2]) && (playingField[2][2] != '*')) {
                gameOver = true;
            } else if ((playingField[0][0] == playingField[1][1]) && (playingField[1][1] == playingField[2][2]) && (playingField[2][2] != '*')) {
                gameOver = true;
            } else if ((playingField[0][2] == playingField[1][1]) && (playingField[1][1] == playingField[2][0]) && (playingField[2][0] != '*')) {
                gameOver = true;
            }
        }
        return gameOver;
    }

    private void checkField(int row, int column) {
        int val = row * 10 + column;
        if (playingField[row][column] == '*') {
            countOfField(val);
        } else System.out.println("Enter another value");
    }

    private void countOfField(int valueField) {
        if (movesPlayer % 2 != 0) {
            movesPlayer++;
            switch (valueField) {
                case 0: {
                    playingField[0][0] = 'X';
                    break;
                }
                case 1: {
                    playingField[0][1] = 'X';
                    break;
                }
                case 2: {
                    playingField[0][2] = 'X';
                    break;
                }
                case 10: {
                    playingField[1][0] = 'X';
                    break;
                }
                case 11: {
                    playingField[1][1] = 'X';
                    break;
                }
                case 12: {
                    playingField[1][2] = 'X';
                    break;
                }
                case 20: {
                    playingField[2][0] = 'X';
                    break;
                }
                case 21: {
                    playingField[2][1] = 'X';
                    break;
                }
                case 22: {
                    playingField[2][2] = 'X';
                    break;
                }
            }
        } else if (movesPlayer % 2 == 0) {
            movesPlayer++;
            switch (valueField) {
                case 0: {
                    playingField[0][0] = 'O';
                    break;
                }
                case 1: {
                    playingField[0][1] = 'O';
                    break;
                }
                case 2: {
                    playingField[0][2] = 'O';
                    break;
                }
                case 10: {
                    playingField[1][0] = 'O';
                    break;
                }
                case 11: {
                    playingField[1][1] = 'O';
                    break;
                }
                case 12: {
                    playingField[1][2] = 'O';
                    break;
                }
                case 20: {
                    playingField[2][0] = 'O';
                    break;
                }
                case 21: {
                    playingField[2][1] = 'O';
                    break;
                }
                case 22: {
                    playingField[2][2] = 'O';
                    break;
                }
            }
        }
    }
}

