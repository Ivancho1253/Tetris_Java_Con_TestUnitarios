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

    //Agregue este nuevo para que se verifique si se puede colocar
    public boolean puedeColocarse(Piece piece, int fila, int columna) {
        for (int i = 0; i < piece.getForma().length; i++) {
            for (int j = 0; j < piece.getForma()[i].length; j++) {
                if (piece.getForma()[i][j] != 0) {
                    int nuevaFila = fila + i;
                    int nuevaColumna = columna + j;
    
                    // Verifica que no se salga del tablero
                    if (nuevaFila >= board.length || nuevaColumna >= board[0].length || nuevaFila < 0 || nuevaColumna < 0) {
                        return false; // No se puede colocar
                    }
    
                    // Verifica que no haya otra pieza en esa posición
                    if (board[nuevaFila][nuevaColumna] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void descenderPieza(Piece piezaActual) {
        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);
    
        // Verifica si la pieza puede descender
        if (puedeColocarse(piezaActual, filaActual + 1, columnaActual)) {
            setFilaActual(getFilaActual() + 1);
        }
    
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

    //Agregue que se pregunte si se puede mover
    public void moverPiezaDerecha(Piece piezaActual) {
        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);
    
        if (puedeColocarse(piezaActual, filaActual, columnaActual + 1)) {
            setColumnaActual(getColumnaActual() + 1);
        }
    
        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }
    
    public void moverPiezaIzquierda(Piece piezaActual) {
        limpiarPiezaDelTablero(piezaActual, filaActual, columnaActual);
    
        if (puedeColocarse(piezaActual, filaActual, columnaActual - 1)) {
            setColumnaActual(getColumnaActual() - 1);
        }
    
        colocarPieceEnTablero(piezaActual, filaActual, columnaActual);
    }

    /*public void verificarFila() {
        
        for (int i = 0; i < board.length; i++) {
            boolean filaCompleta = true;
    
            // Verificamos si la fila está completa
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    filaCompleta = false;
                    break;
                }
            }
    
            // Si la fila está completa, la eliminamos y bajamos las demás filas
            if (filaCompleta) {
                eliminarFila(i);
                i--; // Volvemos a verificar la fila actual, ya que ahora contiene la fila superior
            }
        }
    }
    
    private void eliminarFila(int fila) {
        // Movemos todas las filas por encima de la fila eliminada una posición hacia abajo

        for (int i = fila; i > 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i - 1][j];
            }
        }
    
        // Limpiamos la fila superior del tablero
        for (int j = 0; j < board[0].length; j++) {
            board[0][j] = 0;
        }
    }*/
}
