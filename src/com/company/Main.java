package com.company;
// . - 46
public class Main {

    public static void main(String[] args) {
        GameFront gameFront = new GameFront();
        GameMain gameMain = new GameMain();
        GameField gameField = new GameField();
        gameFront.startGame();
        try{
            gameFront.startGame();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        while(gameFront.isWon()){
            gameField.outField();
            gameMain.askForNumber();
            gameField.outField();
            gameMain.gameFinish();
        }
    }


}
