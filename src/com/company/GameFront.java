package com.company;

import java.util.Scanner;

public class GameFront {

    public boolean isWon() {
        return isWon;
    }

    private boolean isWon = true;

    Main main = new Main();

    GameField gameField = new GameField();

    public void startGame(){
        System.out.println("Input the size of your game field (from 2 to 5: ");
        Scanner in = new Scanner(System.in);
        int fieldSize = in.nextInt();
        if(fieldSize < 2 || fieldSize > 5){
            System.out.println("Sth's wrong");
            startGame();
        } else{
            gameField.setFieldSize(fieldSize);
            int field[][] = new int[gameField.getFieldSize()][gameField.getFieldSize()];
            gameField.onStartGameField();
        }
    }

    public void gameFinish(){
        System.out.println("Congratulations! You won!!!");
        isWon = false;
    }

}
