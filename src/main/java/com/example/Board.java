package com.example;
import java.util.Random;


public class Board {
    
    public int [][] board;
    public int fila=10;
    public int columna=20;
    public Random random;

    public Board(){
        board = new int[fila][columna];
        random = new Random();
    }

    public Board(int [][] board, Random random){ 
        this.board = board;
        random = new Random();
    }
    
    public void ingresarNuevaPieza (Piece piece){
        int posicionInicial = random.nextInt(columna - piece.getForma()[0].length + 1);
        colocarPieceEnTablero(piece, 0 , posicionInicial);
    }
    
    public void colocarPieceEnTablero(Piece piece, int fila, int columna){

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[0].length; j++) {

                if (piece.getForma()[i][j] != 0) {

                    board[fila + i][columna + j] = piece.getForma()[i][j];
                }
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }
    public int[][] getNuevaBoard() {
        int[][] nuevaBoard = new int[fila][columna];
    
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                nuevaBoard[i][j] = board[i][j];
            }
        }
    
        return nuevaBoard;
    }

}
