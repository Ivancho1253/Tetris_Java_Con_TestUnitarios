package com.example;

public class PieceT extends Piece {
    public PieceT(int crear) {
        super(crear); // Llama al constructor de la clase base
    }

    public int getFueCreado() {
        return 1; // Retorna 1 para indicar que fue creado
    }
}
