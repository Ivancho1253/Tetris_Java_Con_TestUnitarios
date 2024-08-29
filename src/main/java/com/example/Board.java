package com.example;

public class Board {
    public int [][] board;
    public int fila=10;
    public int columna=20;
    public Board(){
        board=new int[fila][columna];
    }
    public Board(int [][] board) {
        this.board = board;
    }


    

}
