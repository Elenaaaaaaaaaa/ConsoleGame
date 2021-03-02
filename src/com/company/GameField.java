package com.company;

import java.util.Scanner;

public class GameField {

    private int fieldSize;

    public int[][] getGameField() {
        return gameField;
    }

    private int gameField[][];

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    public void setGameFieldNum(int num, int column){
        gameField[fieldSize - 1][column] = num;
        for (int i = 0; i < fieldSize; i++) {
        }
    }

    public void setGameField(int[][] gameField) {
        this.gameField = gameField;
    }

    public void onStartGameField(){
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                gameField[i][j] = 46;
            }
        }
    }

    public void outField(){
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if(gameField[i][j] == (int) '.'){
                    System.out.printf("%s5", ".");
                } else {
                    System.out.printf("%d5", gameField[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }


}
