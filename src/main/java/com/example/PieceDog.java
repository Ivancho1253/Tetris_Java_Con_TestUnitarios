package com.example;

public class PieceDog 
            extends Piece{

    public PieceDog() {
        int [][] forma = {

            {
             1, 1,0,
             0, 1,1,
             0,0,0}
        };
        
        setForma(forma);
    }
    
    public PieceDog(boolean existencia, int [][] forma) {
        super(existencia, forma); 
    }   
}