package com.example;

public class PieceStick 
            extends Piece {

    public PieceStick() {
        int [][] forma = {

            {
             1, 1,
             1, 1}
        };
        
        setForma(forma);
    }
    
    public PieceStick(boolean existencia, int [][] forma) {
        super(existencia, forma); 
    }   
}