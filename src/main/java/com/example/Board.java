package com.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Board {

    public int[][] board;
    public int fila = 10;
    public int columna = 20;
    public Random random;
    public Instant tiempoDespues;
    public Duration delayTime = Duration.ofSeconds(2);

    public Board(){
        
        board = new int[fila][columna];
        random = new Random();
        tiempoDespues = Instant.now();
        delayTime = Duration.ofSeconds(2);
    }
    
    public Board(int[][] board, Random random) {
        this.board = board;
        random = new Random();
    }

    public void setTiempoDespues(Instant tiempoDespues){
        this.tiempoDespues = tiempoDespues;
    }

    public void setBoard(int[][] board){
        this.board = board;
    }


    public void ingresarNuevaPieza(Piece piece) {

        int posicionInicial = random.nextInt(columna - piece.getForma()[0].length + 1);
        colocarPieceEnTablero(piece, 0, posicionInicial);

    }

    public void colocarPieceEnTablero(Piece piece, int fila, int columna) {

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[0].length; j++) {

                if (piece.getForma()[i][j] != 0) {
                    if(fila + i < board.length && columna + j < board[0].length){  //Verifico que no salga del tablero

                        //setBoard(fila + i, columna + j,piece.getForma()[i][j]);
                        board[fila + i][columna + j] = piece.getForma()[i][j]; 
                    }
                }
            }
        }
    }

    public void descenso(Piece piece) {

        /* Calcula entre el tiempo final de la pieza con el inicio cuanto tarda con la
        restriccion de 2 seg */

        if (Duration.between(tiempoDespues, Instant.now()).compareTo(delayTime) >= 0) {

            for (int i = fila - 2 ; i >= 0; i--) {   //Se mueve las filas hasta la penultima
                for (int j = 0; j < columna; j++){ 
                    
                    //setBoard(fila + 1, columna, board[i][j]);
                    board[i + 1][j] = board[i][j];  //Mueve el contenido a la fila de abajo
                }
            }
    
            setTiempoDespues(Instant.now());  //Actualiza el tiempo para que se mueva cada 2 seg
            //tiempoDespues=Instant.now();
        }
    }    
    
    public int[][] getBoard() {

        for (int i = 0; i < fila; i++){
            for (int j = 0; j < columna; j++){
                
                board[i][j] = board[i][j];
                //setBoard(fila, columna, board[i][j]);
            }
        }
        return board;
    }
}
