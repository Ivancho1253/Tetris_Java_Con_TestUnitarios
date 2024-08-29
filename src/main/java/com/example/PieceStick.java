package com.example;

public class PieceStick 
            extends Piece {

    public PieceStick() {
        int [][] forma = {

            {
             0, 1, 0, 0,
             0, 1, 0, 0,
             0, 1, 0, 0,
             0, 1, 0, 0
            }
        };
        
        setForma(forma);

        int[][]nuevaForma={
            {
                1,1,1,1
            }
        };
        setForma(nuevaForma);
    }
    
    public PieceStick(boolean existencia, int [][] forma) {
        super(existencia, forma); 
    }   
}