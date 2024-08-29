package com.example;

public class Piece 
            extends Tetris{

    public boolean  existencia;
    public int [][] forma;
    
    public Piece() {
    }

    public Piece(boolean existencia, int [][] forma) {
        this.existencia = existencia;
        this.forma = forma;
    }

    public boolean getExistencia() {
        return existencia; 
    } 

    public void setForma(int [][] forma) {
        this.forma = forma;
    }
    
    public int [][] getForma(){
        return forma;
    }
}
