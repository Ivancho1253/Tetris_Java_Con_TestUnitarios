package com.example;

public class PieceL 
            extends Piece {
    
    public PieceL() {
        int[][] formaDerecha = {

            
            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
            
        };
        setForma(formaDerecha);
    }
    public void izquierda(){

        int[][] formaIzquierda = {

            
            {0, 1, 0},
            {0, 1, 0},
            {1, 1, 0}
            
        };

        setForma(formaIzquierda);
    }
    

    public PieceL(boolean existencia) {
        super(existencia, null); 
    }

}
