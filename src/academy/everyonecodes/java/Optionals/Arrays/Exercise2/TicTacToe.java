package academy.everyonecodes.java.Optionals.Arrays.Exercise2;

import java.util.Scanner;

public class TicTacToe {
    private String[][] getEmptyGameField() {
        String[][] gameField = new String[3][3];
        return gameField;
    }

    private void printGameField(String[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++ ) {
                System.out.print("[");
                if (gameField[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(gameField[i][j]);
                }
                System.out.print("]");
            }
            System.out.print("\n");
            //System.out.println("[" + gameField[i][0] + "]" + " " + "[" + gameField[i][1] + "]" + " " + "[" + gameField[i][2] + "]");
        }
    }

    private void playOneRound(String[][] gameField, String playerName, String symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(playerName + ", what is your next move? (Row: [0, 1, 2], press Enter, Column: [0, 1, 2])");
        int[] move = new int[2];
        for (int i = 0; i < move.length; i++) {
            int x = scanner.nextInt();
            move[i] = x;
        }
        gameField[move[0]][move[1]] = symbol;
        printGameField(gameField);
    }

    public void play() {
        String[][] gameField = getEmptyGameField();
        printGameField(gameField);
        Scanner scanner = new Scanner(System.in);
        boolean isPlayerOne = true;
        boolean isGameOver = false;
        String playerName;
        String symbol;
        while (!isGameOver) {
            if (isPlayerOne) {
                playerName = "Player One";
                symbol = "X";
                isPlayerOne = false;
            } else {
                playerName = "Player Two";
                symbol = "0";
                isPlayerOne = true;
            }
            playOneRound(gameField, playerName, symbol);
            //isPlayerOne = !isPlayerOne; <--without true/false

            System.out.println("Is the game over? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equals("y")) {
                isGameOver = true;
            }
        }


    }
}
