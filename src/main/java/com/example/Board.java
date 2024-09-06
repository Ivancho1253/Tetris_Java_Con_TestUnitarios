package com.example;

import java.util.Random;

public class Board {

    public int[][] board;
    public int fila = 10;
    public int columna = 20;
    public Random random;
    public Piece piezaActual;

    private int filaActual;
    private int columnaActual;

    public Board() {

        board = new int[fila][columna];
        random = new Random();
        filaActual = 0;
        columnaActual = 0;

    }
    
    public void setPiezaActual(Piece piezaActual) {
        this.piezaActual = piezaActual;
    } 

    public void setBoard(int fila, int columna, int valor) {

        board[fila][columna] = valor;
    }

    public void ingresarNuevaPieza(Piece piece) {   //Permite colocar la pieza en el tablero 

        setPiezaActual(piece);
        colocarPieceEnTablero(piezaActual, 0, 0);
        filaActual = 0;
        columnaActual = 0;
    }
    
    public void colocarPieceEnTablero(Piece piece, int fila, int columna) {     //Este metodo es invocado en el metodo IngresarNuevaPieza

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {

                if (piece.getForma()[i][j] != 0) {
                    if (fila + i < board.length && columna + j < board[0].length) { // Verifico que no salga del tablero
                        setBoard(fila + i, columna + j, piece.getForma()[i][j]);
                    }
                    else{
                        //No pasa nada, la pieza no puede moverse fuera del tablero
                    }
                }
            }
        }
    }

    public int getColumnaActual() {
        return columnaActual;
    }
    public void setColumnaActual(int columnaActual){
        this.columnaActual=columnaActual;
        
    }
    
    public void setFilaActual(int filaActual) {
        this.filaActual = filaActual;
    }

    public int getFilaActual() {
        return filaActual;
    }

    public int[][] getBoard() {
        return board;
    }

    public void descenderPieza(Piece piezaActual) { //Permite mover la pieza para abajo

        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);

        setFilaActual(getFilaActual() + 1);

        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }

    public void limpiarPiezaDelTablero(Piece piece, int fila, int columna) {    //Limpia la pieza del tablero

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {
                if (piece.getForma()[i][j] != 0) {
                    board[fila + i][columna + j] = 0; 
                }
            }
        }
    }

    public void moverPiezaDerecha(Piece piezaActual) {  //Permite mover la pieza para la derecha
        
        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);
       
        setColumnaActual(getColumnaActual() + 1);

        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }

    public void moverPiezaIzquierda(Piece piezaActual) {    //Permite mover la pieza para la izquierda

        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);

        setColumnaActual(getColumnaActual() - 1);

        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }
}
