package com.example;

public class PieceL extends Piece {
    
    public PieceL() {
        int[][] formaDerecha = {

            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
        };
        setForma(formaDerecha);
    }

    public PieceL izquierda(){

        int[][] formaIzquierda = {
            {0, 1, 0},
            {0, 1, 0},
            {1, 1, 0}
        };

        PieceL pieza = new PieceL(); 
        pieza.setForma(formaIzquierda);
        return pieza;
    }

    public PieceL(boolean existencia) {
        super(existencia, null); 
    }
}
