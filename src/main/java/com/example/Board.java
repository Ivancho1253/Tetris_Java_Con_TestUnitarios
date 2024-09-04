package com.example;

import java.util.Random;

public class Board {

    public int[][] board;
    public int fila = 10;
    public int columna = 20;
    public Random random;
    public Piece piezaActual;

    public Board(){
        
        board = new int[fila][columna];
        random = new Random();

    }
    
    public Board(int[][] board, Random random, Piece piezaActual) {
        this.board = board;
        random = new Random();
        this.piezaActual = piezaActual;
    }

    public void setPiezaActual(Piece piezaActual){
        this.piezaActual = piezaActual;	
    }

    public void setBoard(int fila, int columna, int valor){

        board[fila][columna] = valor;
    }

    public void ingresarNuevaPieza(Piece piece) {
        setPiezaActual(piece);
        colocarPieceEnTablero(piezaActual, 0,  0);
    }

    public void colocarPieceEnTablero(Piece piece, int fila, int columna) {

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {

                if (piece.getForma()[i][j] != 0) {
                    if(fila + i < board.length && columna + j < board[0].length){  //Verifico que no salga del tablero

                        setBoard(fila + i, columna + j,piece.getForma()[i][j]);
                    }
                }
            }
        }
    }

    
    public int[][] getBoard() {
        return board;
    }
    

}
