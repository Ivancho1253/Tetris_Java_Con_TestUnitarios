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

    /*public Board(int[][] board, Random random, Piece piezaActual) {
        this.board = board;
        random = new Random();
        this.piezaActual = piezaActual;
    }*/

    public void setPiezaActual(Piece piezaActual) {
        this.piezaActual = piezaActual;
    }

    public void setBoard(int fila, int columna, int valor) {

        board[fila][columna] = valor;
    }

    public void ingresarNuevaPieza(Piece piece) {
        setPiezaActual(piece);
        colocarPieceEnTablero(piezaActual, 0, 0);
        filaActual = 0;
        columnaActual = 0;
    }

    public void colocarPieceEnTablero(Piece piece, int fila, int columna) {

        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {

                if (piece.getForma()[i][j] != 0) {
                    if (fila + i < board.length && columna + j < board[0].length) { // Verifico que no salga del tablero

                        setBoard(fila + i, columna + j, piece.getForma()[i][j]);
                    }
                }
            }
        }
    }

    public int getColumnaActual() {
        return columnaActual;
    }

    public int[][] getBoard() {
        return board;
    }

    public void descenderPieza() {

        // Limpiar la pieza en su posición actual
        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);

        // Mover la pieza una fila abajo
        filaActual++;

        // Colocar la pieza en su nueva posición
        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }

    public void limpiarPiezaDelTablero(Piece piece, int fila, int columna) {
        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {
                if (piece.getForma()[i][j] != 0) {
                    board[fila + i][columna + j] = 0; // Limpiar la posición anterior
                }
            }
        }
    }
}
