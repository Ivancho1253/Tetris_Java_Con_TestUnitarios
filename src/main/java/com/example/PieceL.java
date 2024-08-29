package com.example;

public class PieceL 
            extends Piece {
    
     public PieceL() {
        int [][] forma = {

            {
             0, 1,0,
             0, 1,0,
             1,1,0
            }
        };
        
        setForma(forma);
    }

    public PieceL(boolean existencia, int [][] forma) {
        super(existencia, forma);
    }   
}
