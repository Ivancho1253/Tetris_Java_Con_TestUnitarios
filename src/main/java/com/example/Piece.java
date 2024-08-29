package com.example;

public class Piece 
            extends Tetris {

    public boolean  existencia;
    
    public Piece() {
    }

    public Piece(boolean existencia) {
        this.existencia = existencia; 
    }

    public boolean getExistencia() {
        return existencia; 
    } 
}
