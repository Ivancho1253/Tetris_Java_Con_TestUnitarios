package com.example;

public class PieceT 
            extends Piece {

    public PieceT() {
        int [][]formaT={
            {0,1,0,
            1,1,1}
        };
        setForma (formaT);
    }

    public PieceT(boolean existencia, int [][] forma){
        super(existencia, forma);
    }  
}
