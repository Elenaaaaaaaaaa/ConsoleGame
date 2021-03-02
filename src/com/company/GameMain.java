package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMain {

    GameFront gameFront = new GameFront();

    boolean isWin = false;

    private ArrayList<Integer> numberStorage = new ArrayList<>();
    GameField gameField = new GameField();

    public GameMain(){
        int curNum = 2;
        int maximumPow = 11;
        for (int i = 1; i <= maximumPow; i++) {
            numberStorage.add(curNum);
            curNum = (int)Math.pow(curNum, i);
        }
    }

    public void askForNumber(){
        Random random = new Random(0);
        int a = numberStorage.get(random.nextInt() % 12);
        System.out.printf("Your next number is %d3", a);
        System.out.printf("Choose your column (1 - %d2): ", gameField.getFieldSize());
        Scanner in = new Scanner(System.in);
        int column = in.nextInt();
        if(column < 1 || column > 4){
            System.out.println("Sth's wrong");
            askForNumber();
        } else{
           int gameF [][] = gameField.getGameField();
           gameF[gameField.getFieldSize() - 1][column - 1] = a;
        }
    }

    public void gameFinish(){
        int gameF [][] = gameField.getGameField();
        for (int i = 0; i < gameField.getFieldSize(); i++) {
            if(gameF[gameField.getFieldSize() - 1][i] == 2048){
                gameFront.gameFinish();
            }
        }
    }
}

