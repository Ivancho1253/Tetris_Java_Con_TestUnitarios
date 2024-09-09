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

    public void ingresarNuevaPieza(Piece piece) {   
        if (esFinDelJuego(piece)) {
            return;  // No ingresamos la pieza porque ya no hay espacio
        }
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
    public boolean esFinDelJuego(Piece piece) {
        // Intenta colocar la pieza en la fila superior del tablero
        return !puedeColocarse(piece, 0, 0); // Retorna falso si no hay espacio en la fila superior
    }

   
}